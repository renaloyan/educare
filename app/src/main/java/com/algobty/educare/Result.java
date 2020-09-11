package com.algobty.educare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView scoreTxt, passedFailedTxt;
    private ImageView resultImg;
    private Button finishBtn;
    static int passingScore = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        finishBtn = findViewById(R.id.result_finish_button);
        scoreTxt = findViewById(R.id.result_score);
        passedFailedTxt = findViewById(R.id.passed_failed_text);
        resultImg = findViewById(R.id.image_result);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        scoreTxt.setText("Score: " + score);

        if (score > passingScore){

            resultImg.setImageResource(R.drawable.passed);
            passedFailedTxt.setText("Passed");
            passedFailedTxt.setTextColor(Color.GREEN);

        }
        else {

            resultImg.setImageResource(R.drawable.failed);
            passedFailedTxt.setText("Failed");
            passedFailedTxt.setTextColor(Color.RED);

        }

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Home.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });

    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Home.class));
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();
    }
}