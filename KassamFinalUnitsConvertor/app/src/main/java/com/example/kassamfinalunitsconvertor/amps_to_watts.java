package com.example.kassamfinalunitsconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class amps_to_watts extends AppCompatActivity {

    Button back, convert;
    TextView watts;
    EditText Amps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amps_to_watts2);

        back = findViewById(R.id.back);
        convert = findViewById(R.id.convert);
        watts = findViewById(R.id.watts);
        Amps = findViewById(R.id.amps);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(amps_to_watts.this, MainActivity.class);
                startActivity(i);

            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Samps  = Float.parseFloat(Amps.getText().toString());
                int convertionvalue = 240;
                final float answer = Samps*convertionvalue;

                watts.setText(answer + "  watts");

                watts.animate().translationY(-100);

            }
        });
    }
}
