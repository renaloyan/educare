package com.algobty.educare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splash = new Thread() {
            public void run() {
                try {
                    sleep(3*1000);
                    startActivity(new Intent(MainActivity.this, Login.class));
                    finish();
                }catch (Exception e){

                }
            }
        };
        splash.start();

    }
}