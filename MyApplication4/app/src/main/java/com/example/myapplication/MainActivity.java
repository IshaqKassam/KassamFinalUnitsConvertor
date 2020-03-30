package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    EditText oliver, wahu, bavon;
    Button ruth;
   // EditText wahu;
   // EditText bavon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView3);
        oliver = findViewById(R.id.editText);
        ruth = findViewById(R.id.login);

        ruth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anything = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(anything);
                finish();

            }
        });

    }
}
