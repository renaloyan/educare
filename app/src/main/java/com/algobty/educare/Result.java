package com.algobty.educare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Result extends AppCompatActivity {

    private TextView scoreTxt, passedFailedTxt, gradeTxt, subjectTxt, quarterTxt;
    private ImageView resultImg;
    private Button finishBtn, tryAgainBtn;
    static int passingScore = 15;
    static int perfectScore = 20;

    public static int gradeClicked;
    public static int quarterClicked;
    public static int subjectClicked;

    AdView adView1, adView2;
    InterstitialAd interstitialAd1, interstitialAd2;

    public MediaPlayer perfectAudio, passedAudio, failedAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        finishBtn = findViewById(R.id.result_finish_button);
        scoreTxt = findViewById(R.id.result_score);
        passedFailedTxt = findViewById(R.id.passed_failed_text);
        resultImg = findViewById(R.id.image_result);
        tryAgainBtn = findViewById(R.id.result_retry_button);
        adView1 = findViewById(R.id.adView1);
        adView2 = findViewById(R.id.adView2);
        gradeTxt = findViewById(R.id.result_grade);
        subjectTxt = findViewById(R.id.result_subject);
        quarterTxt = findViewById(R.id.result_quarter);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        //gets the chosen grade and quarter
        gradeClicked = intent.getIntExtra("gradeClicked", 7);
        quarterClicked = intent.getIntExtra("quarterClicked", 1);
        subjectClicked = intent.getIntExtra("subjectClicked", 1);
        intent.removeExtra("gradeClicked");
        intent.removeExtra("quarterClicked");
        intent.removeExtra("subjectClicked");

        scoreTxt.setText("Score: " + score);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        //request an ads
        AdRequest adRequest = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);
        adView2.loadAd(adRequest);

        //interstitialAd
        interstitialAd1 = new InterstitialAd(this);
        interstitialAd1.setAdUnitId("ca-app-pub-7228366808257832/6492895231");
        interstitialAd1.loadAd(new AdRequest.Builder().build());

        interstitialAd2 = new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-7228366808257832/6130751393");
        interstitialAd2.loadAd(new AdRequest.Builder().build());

       if(score == perfectScore){

            resultImg.setImageResource(R.drawable.perfect);
            passedFailedTxt.setText("Perfect");
            passedFailedTxt.setTextColor(Color.GREEN);
            perfectAudio = MediaPlayer.create(getApplicationContext(), R.raw.perfect);
            perfectAudio.start();

        }
        else if (score >= passingScore){

            resultImg.setImageResource(R.drawable.passed);
            passedFailedTxt.setText("Passed");
            passedFailedTxt.setTextColor(Color.GREEN);
            passedAudio = MediaPlayer.create(getApplicationContext(), R.raw.passed);
            passedAudio.start();

        }
        else {

            resultImg.setImageResource(R.drawable.failed);
            passedFailedTxt.setText("Failed");
            passedFailedTxt.setTextColor(Color.RED);
            failedAudio = MediaPlayer.create(getApplicationContext(), R.raw.failed);
            failedAudio.start();

        }

        //gradeLvl
        switch (gradeClicked) {
            case 7:
                gradeTxt.setText("Grade 7");
                break;
            case 8:
                gradeTxt.setText("Grade 8");
                break;
            case 9:
                gradeTxt.setText("Grade 9");
                break;
            case 10:
                gradeTxt.setText("Grade 10");
                break;
            case 11:
                gradeTxt.setText("Grade 11");
                break;
            case 12:
                gradeTxt.setText("Grade 12");
                break;
        }

        //quarterStatic data
        quarterTxt.setText("First Quarter");

        //subject
        switch (subjectClicked) {
            case 1:
                subjectTxt.setText("AP");
                break;
            case 2:
                subjectTxt.setText("Science");
                break;
            case 3:
                subjectTxt.setText("ESP");
                break;
            case 4:
                subjectTxt.setText("MAPEH");
                break;
            case 5:
                subjectTxt.setText("MATH");
                break;
            case 6:
                subjectTxt.setText("ICT");
                break;
            case 7:
                subjectTxt.setText("FILIPINO");
                break;
            case 8:
                subjectTxt.setText("RESEARCH");
                break;
            case 9:
                subjectTxt.setText("ENGLISH");
                break;
        }

        interstitialAd1.setAdListener(new AdListener(){
            @Override
            public void onAdClosed(){
                gotoSubject();
            }
        });

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (interstitialAd1.isLoaded()){
                    interstitialAd1.show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), SubjectCardActivity.class);
                    intent.putExtra("gradeClicked", gradeClicked);
                    intent.putExtra("quarterClicked", quarterClicked);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    finish();
                }

            }
        });

        interstitialAd2.setAdListener(new AdListener(){
            @Override
            public void onAdClosed(){
                gotoQuiz();
            }
        });

        tryAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (interstitialAd2.isLoaded()){
                    interstitialAd2.show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), Quiz.class);
                    intent.putExtra("gradeClicked", gradeClicked);
                    intent.putExtra("quarterClicked", quarterClicked);
                    intent.putExtra("subjectClicked", subjectClicked);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                }

            }
        });

    }


    private void gotoSubject() {

            Intent intent = new Intent(getApplicationContext(), SubjectCardActivity.class);
            intent.putExtra("gradeClicked", gradeClicked);
            intent.putExtra("quarterClicked", quarterClicked);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            finish();

    }

    private void gotoQuiz() {

        Intent intent = new Intent(getApplicationContext(), Quiz.class);
        intent.putExtra("gradeClicked", gradeClicked);
        intent.putExtra("quarterClicked", quarterClicked);
        intent.putExtra("subjectClicked", subjectClicked);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish();

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), SubjectCardActivity.class);
        intent.putExtra("gradeClicked", gradeClicked);
        intent.putExtra("quarterClicked", quarterClicked);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        perfectAudio.stop();
        passedAudio.stop();
        failedAudio.stop();
    }
}