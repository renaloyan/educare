package com.algobty.educare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.algobty.educare.question.Question;
import com.algobty.educare.question.QuizDbHelper;

import java.util.Collections;
import java.util.List;
import java.util.Locale;


public class Quiz extends AppCompatActivity {

    private TextView scoreTxt, noQuestion, timeTxt, questionTxt;
    private RadioGroup rbGroup;
    private RadioButton optionA, optionB, optionC, optionD;
    private Button submitBtn;

    private List<Question> questionList;

    private ColorStateList textColorDefaultRb;
    private int questionCounter;
    private int questionCountTotal;
    private Question currentQuestion;
    private int score;
    private boolean answered;
    private long backPressedTime;

    private static final long COUNTDOWN_IN_MILLIS = 120000;
    private ColorStateList textColorDefaultCd;

    private CountDownTimer countDownTimer;
    private long timeLeftMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        scoreTxt = findViewById(R.id.score_text);
        noQuestion = findViewById(R.id.no_question);
        timeTxt = findViewById(R.id.time_text);
        questionTxt = findViewById(R.id.question_text);
        rbGroup = findViewById(R.id.radio_group);
        optionA = findViewById(R.id.option_a);
        optionB = findViewById(R.id.option_b);
        optionC = findViewById(R.id.option_c);
        optionD = findViewById(R.id.option_d);
        submitBtn = findViewById(R.id.submit_btn);

        //gets the chosen grade and quarter
        Intent intent = getIntent();
        int gradeClicked = intent.getIntExtra("gradeClicked", 7);
        int quarterClicked = intent.getIntExtra("quarterClicked", 1);
        int subjectClicked = intent.getIntExtra("subjectClicked", 1);
        intent.removeExtra("gradeClicked");
        intent.removeExtra("quarterClicked");
        intent.removeExtra("subjectClicked");

        textColorDefaultRb = optionA.getTextColors();
        textColorDefaultCd = timeTxt.getTextColors();

        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getQuestion(gradeClicked, quarterClicked, subjectClicked);
        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);

        alertDialogStart();
        showNextQuestion();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!answered) {

                    if (optionA.isChecked() || optionB.isChecked() || optionC.isChecked() || optionD.isChecked()) {

                        checkAnswer();

                    } else {

                        Toast.makeText(Quiz.this, "Please select an answer", Toast.LENGTH_SHORT).show();

                    }

                } else {

                    showNextQuestion();

                }

            }
        });

        if(!isConnected()){

            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.ic_internet_connection)
                    .setTitle("No Internet Connection")
                    .setMessage("Please Check your Internet Connection")
                    .setCancelable(false)
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                        }
                    }).show();

        }

    }

    private void checkAnswer() {

        answered = true;

        countDownTimer.cancel();

        RadioButton rbSelected = findViewById(rbGroup.getCheckedRadioButtonId());
        int answerNr = rbGroup.indexOfChild(rbSelected) + 1;

        if (answerNr == currentQuestion.getCorrectAns()) {

            score++;
            scoreTxt.setText("Score: " + score);

        }

        showSolution();

    }

    private void showSolution() {

        optionA.setTextColor(Color.RED);
        optionB.setTextColor(Color.RED);
        optionC.setTextColor(Color.RED);
        optionD.setTextColor(Color.RED);

        switch (currentQuestion.getCorrectAns()) {
            case 1:
                optionA.setTextColor(Color.GREEN);
                questionTxt.setText("Letter A is correct");
                break;
            case 2:
                optionB.setTextColor(Color.GREEN);
                questionTxt.setText("Letter B is correct");
                break;
            case 3:
                optionC.setTextColor(Color.GREEN);
                questionTxt.setText("Letter C is correct");
                break;
            case 4:
                optionD.setTextColor(Color.GREEN);
                questionTxt.setText("Letter D is correct");
                break;
        }

        if (questionCounter < questionCountTotal) {

            submitBtn.setText("Next");

        } else {

            submitBtn.setText("Finish");

        }

    }

    private void showNextQuestion() {

        optionA.setTextColor(textColorDefaultRb);
        optionB.setTextColor(textColorDefaultRb);
        optionC.setTextColor(textColorDefaultRb);
        optionD.setTextColor(textColorDefaultRb);
        rbGroup.clearCheck();

        if (questionCounter < questionCountTotal) {

            currentQuestion = questionList.get(questionCounter);

            questionTxt.setText(currentQuestion.getQuestion());
            optionA.setText(currentQuestion.getOptionA());
            optionB.setText(currentQuestion.getOptionB());
            optionC.setText(currentQuestion.getOptionC());
            optionD.setText(currentQuestion.getOptionD());

            questionCounter++;
            noQuestion.setText(questionCounter + "/" + questionCountTotal);
            answered = false;
            submitBtn.setText("Submit");

            timeLeftMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();

        } else {

            SharedPreferences myPrefs = getSharedPreferences("sharedPref", MODE_PRIVATE);
            SharedPreferences.Editor editor = myPrefs.edit();
            editor.putInt("SCORE", score);
            editor.apply();
            Intent intent = new Intent(getApplicationContext(), Result.class);
            intent.putExtra("score", score);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();

        }

    }

    private void startCountDown() {

        countDownTimer = new CountDownTimer(timeLeftMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                timeLeftMillis = millisUntilFinished;
                updateCountDownText();

            }

            @Override
            public void onFinish() {

                timeLeftMillis = 0;
                updateCountDownText();
                checkAnswer();

            }
        }.start();

    }

    private void updateCountDownText(){

        int minutes = (int) (timeLeftMillis / 1000) / 60;
        int seconds = (int) (timeLeftMillis / 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timeTxt.setText(timeFormatted);

        if (timeLeftMillis < 10000){

            timeTxt.setTextColor(Color.RED);

        }
        else {

            timeTxt.setTextColor(textColorDefaultCd);

        }

    }

    private void finishQuiz() {

        SharedPreferences myPrefs = getSharedPreferences("sharedPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putInt("SCORE", score);
        editor.apply();
        Intent intent = new Intent(getApplicationContext(), Result.class);
        intent.putExtra("score", score);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish();

    }

    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            finishQuiz();
        }
        else {
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    private void alertDialogStart() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Read Me")
                .setMessage("1. This activity is scrollable, " +
                        "2. Passing score is 85%, " +
                        "3. Time limit for each questions is 2 minutes, " +
                        "4. To save the test and continue and answering later. Just press your phone menu or home button. To end quiz right away. Just press your phone's back button twice")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();

                    }
                }).show();

    }

    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return  networkInfo != null && networkInfo.isConnected();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null){

            countDownTimer.cancel();

        }
    }
}