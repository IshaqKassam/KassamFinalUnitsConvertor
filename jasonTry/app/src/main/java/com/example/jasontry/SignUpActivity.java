package com.example.jasontry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    EditText email, pass;
    TextView tv;
    Button btn, login;
    ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();
        InitializeUI();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RegisterNewUser();
            }
        });
    }

private void RegisterNewUser(){
    progressBar.setVisibility(View.VISIBLE);

        String Semail,Spass;
        Semail = email.getText().toString();
        Spass = pass.getText().toString();

//CHECKING IF THE FIELDS FOR THE PASSWORD AND EMAIL AREN'T EMPTY
        if(TextUtils.isEmpty(Semail)){
            Toast.makeText(getApplicationContext(), "enter your email", Toast.LENGTH_LONG).show();
            return;
        }
        if(TextUtils.isEmpty(Spass)){
            Toast.makeText(getApplicationContext(), "enter your password", Toast.LENGTH_LONG).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(Semail, Spass)//USE THE STRING LOCATIONS
     .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {

        if (task.isSuccessful()){
            Toast.makeText(getApplicationContext(), "successful", Toast.LENGTH_LONG).show();
            progressBar.setVisibility(View.GONE);

            Intent i = new Intent(SignUpActivity.this,LoginActivity.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(), "Sorry Action Incomplete", Toast.LENGTH_LONG).show();
            progressBar.setVisibility(View.GONE);
        }

    }
});
}
    private void InitializeUI(){
        email = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        btn = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);
        tv = findViewById(R.id.signup);
        login = findViewById(R.id.login_option);
    }

    public void registerClicked(View v){
        Log.v("ButtonClicked", "The text entered is: " + email.getText().toString());

    }
}
