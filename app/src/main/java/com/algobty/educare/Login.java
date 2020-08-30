package com.algobty.educare;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.scottyab.showhidepasswordedittext.ShowHidePasswordEditText;

public class Login extends AppCompatActivity {

    //instance
    private Button loginButton;
    private EditText emailInput;
    private TextView createAccount, forgotPassword;
    private ProgressBar progressBar;

    private ShowHidePasswordEditText passwordInput;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //connect to view components
        loginButton = findViewById(R.id.login_button);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        createAccount = findViewById(R.id.create_account_text);
        progressBar = findViewById(R.id.login_progressBar);
        forgotPassword = findViewById(R.id.forgot_pass_text);

        //get the instance of firebase auth
        auth = FirebaseAuth.getInstance();
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

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent to CreateAccount Activity
                startActivity(new Intent(Login.this, CreateAccount.class));
                finish();
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgotPassword();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //call loginUser method
              loginUser();

            }
        });
    }

    private void forgotPassword() {
        //instance of Alert Dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //set title
        builder.setTitle("Recover Password");

        //set layout linear layout
        LinearLayout linearLayout = new LinearLayout(this);
        //view to set in dialog
        final EditText emailEditText = new EditText(this);
        emailEditText.setHint("Email");
        emailEditText.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        emailEditText.setMinEms(16);

        linearLayout.addView(emailEditText);
        linearLayout.setPadding(10, 10, 10 , 10);

        builder.setView(linearLayout);

        //buttons recover
        builder.setPositiveButton("Recover", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //input email
                String email = emailEditText.getText().toString().trim();
                //call recoverEmail method
                recoverEmail(email);
            }
        });
        //buttons cancel
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //dismiss
                dialog.dismiss();
            }
        });

        //show dialog
        builder.create().show();
    }

    private void recoverEmail(String email) {

        //shown progressbar
        progressBar.setVisibility(View.VISIBLE);

        //not touchable
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    //hide progressbar
                    progressBar.setVisibility(View.GONE);

                    //touchable
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                    Toast.makeText(Login.this, "Email sent", Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                //hide progressbar
                progressBar.setVisibility(View.GONE);

                //touchable
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                Toast.makeText(Login.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loginUser() {

        //shown progressbar
        progressBar.setVisibility(View.VISIBLE);

        //not touchable
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

        //instance
        String email, password;

        //Convert to string
        email = emailInput.getText().toString().trim();
        password = passwordInput.getText().toString().trim();

        if (TextUtils.isEmpty(email)){
            //hide progressbar
            progressBar.setVisibility(View.GONE);

            //touchable
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

            //Toast or Alert the user
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
        }
        else if (password.length() < 6){
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
        else {
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    //if task successful intent to home activity
                    if(task.isSuccessful()){
                        //hide progressbar
                        progressBar.setVisibility(View.GONE);

                        //touchable
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

                        //intent to home activity
                        startActivity(new Intent(Login.this, Home.class));
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
                    Toast.makeText(Login.this, e.getMessage(), Toast.LENGTH_SHORT).show();
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