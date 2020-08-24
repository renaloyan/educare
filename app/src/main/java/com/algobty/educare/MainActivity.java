package com.algobty.educare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get instance of firebase auth
        auth = FirebaseAuth.getInstance();
        Thread splash = new Thread() {
            public void run() {
                try {
                    if (auth.getCurrentUser() != null){
                        //if user logged in intent to home activity
                        sleep(2 * 1000);
                        startActivity(new Intent(MainActivity.this, Home.class));
                        finish();
                    }
                    else {
                        //if user is not logged in intent to login activity
                        sleep(2 * 1000);
                        startActivity(new Intent(MainActivity.this, Login.class));
                        finish();
                    }
                }catch (Exception e){

                }
            }
        };
        splash.start();

    }
}