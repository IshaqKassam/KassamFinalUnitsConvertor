package com.example.elewana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    imageView = findViewById(R.id.elewana_logo);
    back = findViewById(R.id.back);


    imageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(MainActivity.this, Options.class);
            startActivity(i);

        }
    });

    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           // Intent
        }
    });
    }
}
