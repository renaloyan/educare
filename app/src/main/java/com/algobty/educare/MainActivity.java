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
        Thread splash = new Thread() {
            public void run() {
                try {
                    sleep(2*1000);
                    startActivity(new Intent(MainActivity.this, Login.class));
                    finish();
                }catch (Exception e){

                }
            }
        };
        splash.start();

        auth = FirebaseAuth.getInstance();

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (auth.getCurrentUser() != null){
            //if user logged in directly intent to home activity
            startActivity(new Intent(MainActivity.this, Home.class));
            finish();
        }
    }
}