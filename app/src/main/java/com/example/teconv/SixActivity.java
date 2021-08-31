package com.example.teconv;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.Teconv.R;

import java.text.DecimalFormat;
public class SixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText entTemperature = (EditText) findViewById(R.id.entTemperature);
        Button convertc = (Button) findViewById(R.id.convertc);
        Button convertf = (Button) findViewById(R.id.convertf);
        Button convertk = (Button) findViewById(R.id.convertk);
        Button convertr = (Button) findViewById(R.id.convertr);
        Button status = (Button) findViewById(R.id.status);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        final TextView weResult = (TextView) findViewById(R.id.weResult);

        Intent i = getIntent();

        convertc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SixActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-7.5)*40/21;
                result = temperatureEnted + "°Ro" + " is " + tenth.format(convertedTemperature) +
                        " in C";
                tvResult.setText(result);
            }
        });

        convertf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SixActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-7.5)*(24/7)+32;
                result = temperatureEnted + "°Ro" + " is " + tenth.format(convertedTemperature) +
                        " in F";
                tvResult.setText(result);
            }
        });

        convertk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SixActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-7.5)*(40/21)+273.15;
                result = temperatureEnted + "°Ro" + " is " + tenth.format(convertedTemperature) +
                        " in K";
                tvResult.setText(result);
            }
        });
        convertr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SixActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-7.5) *(24/7)+ 491.67;
                result = temperatureEnted + "°Ro" + " is " + tenth.format(convertedTemperature) +
                        " in R";
                tvResult.setText(result);
            }
        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SixActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());


                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                if (temperatureEnted <7.5) {
                    res = "Extremely cold ";

                } else if (temperatureEnted == 7.5) {
                    res = "Freezing Point of Water";

                } else if (temperatureEnted > 7.5 && temperatureEnted < 18.5) {
                    res = "Cold";
                } else if (temperatureEnted == 18.5) {
                    res = "Room Temperature";
                } else if (temperatureEnted > 18.5 && temperatureEnted < 26.9) {
                    res = "Beach weather";
                } else if (temperatureEnted == 26.9) {
                    res = "Body temperature";
                } else if (temperatureEnted > 26.9 && temperatureEnted < 60) {
                    res = "Hot";
                } else if (temperatureEnted == 60) {
                    res = "Boiling Point of water";
                }
                else if (temperatureEnted >60) {
                    res = "Extremely hot";
                }
                weResult.setText(res);

            }
        });
    }
}



