package com.example.jasontry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

   // Button button;
    //TextView tv;
    //EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* button = findViewById(R.id.btn);
        tv= findViewById(R.id.textview);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the string storage should be inside the onClick clause...it stores the message within the activity
                String messasge = editText.getText().toString();
                tv.setText(messasge); //this shows the messaage stored in the string in the textview
            }
        });*/

    }
}
