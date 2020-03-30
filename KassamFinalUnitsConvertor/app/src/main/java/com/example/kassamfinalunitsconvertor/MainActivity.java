package com.example.kassamfinalunitsconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome;
    Button wattsToHorsepower, ampsToWatts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = findViewById(R.id.welcome);
        wattsToHorsepower = findViewById(R.id.wattsToHorsepower);
        ampsToWatts = findViewById(R.id.ampsToWatts);

        wattsToHorsepower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,WattsToHorsepower.class);
                startActivity(i);
            }
        });

        ampsToWatts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,amps_to_watts.class);
                startActivity(i);
            }
        });
    }
}
