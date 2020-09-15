package com.algobty.educare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.scottyab.showhidepasswordedittext.ShowHidePasswordEditText;

public class CreateAccount extends AppCompatActivity {

    //instance
    private Button createAccountButton;
    private EditText emailInput, usernameInput;
    private TextView loginText, privacyPolicy, termsConditions;
    private ProgressBar progressBar;

    private ShowHidePasswordEditText passwordInput, confirmPasswordInput;

    private FirebaseAuth auth;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        //connect to view components
        createAccountButton = findViewById(R.id.create_account_button);
        emailInput = findViewById(R.id.create_email_input);
        usernameInput = findViewById(R.id.create_name_input);
        loginText = findViewById(R.id.login_text);
        progressBar = findViewById(R.id.create_progressBar);
        passwordInput = findViewById(R.id.create_password_input);
        confirmPasswordInput = findViewById(R.id.confirm_password_input);
        privacyPolicy = findViewById(R.id.privacy_policy);
        termsConditions = findViewById(R.id.terms_conditions);

        //get the instance of firebase auth
        auth = FirebaseAuth.getInstance();

        //get the instance of firebase database
        database = FirebaseDatabase.getInstance();

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

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to Login Activity
                startActivity(new Intent(CreateAccount.this, Login.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });

        privacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        termsConditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void createAccount() {
        //shown progressbar
        progressBar.setVisibility(View.VISIBLE);

        //not touchable
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

        //instance
        final String username, email, password, confirmPassword;

        //Convert to string
        username = usernameInput.getText().toString().trim();
        email = emailInput.getText().toString().trim();
        password = passwordInput.getText().toString().trim();
        confirmPassword = confirmPasswordInput.getText().toString().trim();

        String emailPattern = "[a-zA-z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (TextUtils.isEmpty(username)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or Alert the user
            Toast.makeText(this, "Please enter your username", Toast.LENGTH_SHORT).show();
        }
        else if (username.length() >= 15) {
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or Alert the user
            Toast.makeText(this, "Username too long", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(email)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
        }
        else if (!TextUtils.equals(email, emailPattern)) {
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or Alert the user
            Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show();
        }
        else if (password.length() < 6){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Password length at least 6 characters", Toast.LENGTH_SHORT).show();
        }
        else if (confirmPassword.length() < 6){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Password length at least 6 characters", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(confirmPassword)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Please confirm your password", Toast.LENGTH_SHORT).show();
        }
        else if (!password.equals(confirmPassword)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Password and Confirm Password does not match", Toast.LENGTH_SHORT).show();
        }
        else {
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    //if task successful intent to home activity
                    if(task.isSuccessful()){
                        //add data to database reference "Users"
                        databaseReference = database.getReference("Users");

                        //call UserHelper class
                        UserHelper userHelper = new UserHelper(username);

                        //set data to current user
                        databaseReference.child(auth.getCurrentUser().getUid()).setValue(userHelper);

                        //hide progressbar
                        progressBar.setVisibility(View.GONE);

                        //touchable
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                        //intent to onboarding activity
                        startActivity(new Intent(CreateAccount.this, OnBoarding.class));
                        overridePendingTransition(R.anim.anim_up_in, R.anim.slide_up_out);
                        finish();
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    //hide progressbar
                    progressBar.setVisibility(View.GONE);

                    //touchable
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                    //Toast or alert the user
                    Toast.makeText(CreateAccount.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
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

    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return  networkInfo != null && networkInfo.isConnected();

    }
}