package com.algobty.educare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    private Button loginButton;
    private EditText emailInput, passwordInput;
    private TextView createAccount;
    private ProgressBar progressBar;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //instance
        loginButton = findViewById(R.id.login_button);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        createAccount = findViewById(R.id.create_account_text);
        progressBar = findViewById(R.id.progressBar);

        auth = FirebaseAuth.getInstance();

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent to CreateAccount Activity
                startActivity(new Intent(Login.this, CreateAccount.class));
                finish();
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

    private void loginUser() {

        //shown progressbar
        progressBar.setVisibility(View.VISIBLE);

        //not touchable
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);

        //instance
        String email, password;

        //Convert to string
        email = emailInput.getText().toString();
        password = passwordInput.getText().toString();

        if (TextUtils.isEmpty(email)){
            //Toast or Alert the user
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
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

    public void ShowHidePass(View view){

        if(view.getId()==R.id.show_pass_btn){
            if (passwordInput.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.hide_pass);

                //show pass
                passwordInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        }
        else {
            ((ImageView)(view)).setImageResource(R.drawable.show_pass);

            //hide pass
            passwordInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}