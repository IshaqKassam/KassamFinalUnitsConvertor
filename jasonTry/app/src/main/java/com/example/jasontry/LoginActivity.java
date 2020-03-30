package com.example.jasontry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {


    EditText email,password;
    Button btn;
    ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        InitializeUI();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

        private void loginUserAccount() {
            progressBar.setVisibility(View.VISIBLE);

            String Semail, Spass;
            Semail = email.getText().toString();
            Spass = password.getText().toString();

            if(TextUtils.isEmpty(Semail)){
                Toast.makeText(LoginActivity.this,"Enter Email", Toast.LENGTH_LONG ).show();
            }

            if(TextUtils.isEmpty(Spass)){
                Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
            }


            mAuth.signInWithEmailAndPassword(Semail,Spass)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"Successful", Toast.LENGTH_LONG).show();

                                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                                startActivity(i);
                            }


                            else{
                                Toast.makeText(getApplicationContext(), "Unsuccessful...ERROR", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }

    private void InitializeUI(){
        email = findViewById(R.id.emailLogin);
        password = findViewById(R.id.pass);
        btn = findViewById(R.id.loginbtn);
        progressBar = findViewById(R.id.progressBar2);
    }
}
