package com.algobty.educare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
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
    private TextView loginText;
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
        progressBar = findViewById(R.id.progressBar);
        passwordInput = findViewById(R.id.create_password_input);
        confirmPasswordInput = findViewById(R.id.confirm_password_input);

        //get the instance of firebase auth
        auth = FirebaseAuth.getInstance();

        //get the instance of firebase database
        database = FirebaseDatabase.getInstance();

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent to Login Activity
                startActivity(new Intent(CreateAccount.this, Login.class));
                finish();
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
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
        username = usernameInput.getText().toString();
        email = emailInput.getText().toString().trim();
        password = passwordInput.getText().toString().trim();
        confirmPassword = confirmPasswordInput.getText().toString().trim();

        if (TextUtils.isEmpty(username)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or Alert the user
            Toast.makeText(this, "Please enter your username", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(email)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
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
        else if (password != confirmPassword){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or alert the user
            Toast.makeText(this, "Password and Confirm Password does not match", Toast.LENGTH_SHORT).show();
        }
        else {
            auth.createUserWithEmailAndPassword(username, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
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

                        //intent to home activity
                        startActivity(new Intent(CreateAccount.this, Home.class));
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
}