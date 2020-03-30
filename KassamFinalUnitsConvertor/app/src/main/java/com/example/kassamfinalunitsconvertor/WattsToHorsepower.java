package com.example.kassamfinalunitsconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class WattsToHorsepower extends AppCompatActivity {

    TextView horsepower;
    EditText watts;
    Button back, convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watts_to_horsepower);

        horsepower = findViewById(R.id.horsepower);
        watts = findViewById(R.id.watts);
        back = findViewById(R.id.back_btn);
        convert= findViewById(R.id.convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wattstring = watts.getText().toString();
                int Swatts = Integer.parseInt(wattstring);
                float convertionValue = 745.7f;
                float result = (Swatts) / (convertionValue);

                if (TextUtils.isEmpty(wattstring))
                //if (Swatts == Integer.parseInt(null))
                {
                    Toast.makeText(WattsToHorsepower.this, "enter an amount", LENGTH_LONG)
                            .show(); }
                else {horsepower.setText(Float.toString(result) + "  Horsepower");}

            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WattsToHorsepower.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
