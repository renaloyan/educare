package com.algobty.educare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Profile extends AppCompatActivity {

    private TextView username;
    private Button rankingBtn, aboutBtn, logoutBtn, exitBtn;
    private ImageView settingsBtn;

    private FirebaseAuth auth;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    private String usernameFromDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        username = findViewById(R.id.username_text);
        rankingBtn = findViewById(R.id.ranking_button);
        settingsBtn = findViewById(R.id.settings_button);
        aboutBtn = findViewById(R.id.about_button);
        logoutBtn = findViewById(R.id.logout_button);
        exitBtn = findViewById(R.id.exit_button);

        //get the instance of firebase auth
        auth = FirebaseAuth.getInstance();

        //get the instance of firebase database
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Users").child(auth.getCurrentUser().getUid());

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if (snapshot.exists()){

                    usernameFromDb = snapshot.child("username").getValue(String.class);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        username.setText(usernameFromDb);

        rankingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to ranking activity
                startActivity(new Intent(Profile.this, Ranking.class));
                finish();
            }
        });

        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to settings activity
                startActivity(new Intent(Profile.this, Settings.class));
                finish();
            }
        });

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to about activity
                startActivity(new Intent(Profile.this, About.class));
                finish();
            }
        });

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logout user
                auth.signOut();
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //exit
                finish();
                System.exit(0);
            }
        });


        //bottom nav
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.profile);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(1, 1);
                        finish();
                        return true;
                    case R.id.current_task:
                        startActivity(new Intent(getApplicationContext(), CurrentTask.class));
                        overridePendingTransition(1, 1);
                        finish();
                        return true;
                    case R.id.profile:
                        return true;
                }
                return false;
            }
        });
    }

    //double backpressed
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if(doubleBackToExitPressedOnce){
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}