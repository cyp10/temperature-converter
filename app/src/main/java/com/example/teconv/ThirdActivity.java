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
public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText entTemperature = (EditText) findViewById(R.id.entTemperature);
        Button convertc = (Button) findViewById(R.id.convertc);
        Button convertk = (Button) findViewById(R.id.convertk);
        Button convertr = (Button) findViewById(R.id.convertr);
        Button convertn = (Button) findViewById(R.id.convertn);
        Button status = (Button) findViewById(R.id.status);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        final TextView weResult = (TextView) findViewById(R.id.weResult);

        Intent i = getIntent();

        convertc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(ThirdActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted * 9.0 / 5.0)+32;
                result = temperatureEnted + "F" + " is " + tenth.format(convertedTemperature) +
                        " in C";
                tvResult.setText(result);

            }
        });

        convertk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(ThirdActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-32)*(5/9)+274.15;
                result = temperatureEnted + "F" + " is " + tenth.format(convertedTemperature) +
                        " in K";
                tvResult.setText(result);

            }
        });

        convertr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(ThirdActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted) + 459.67;
                result = temperatureEnted + "F" + " is " + tenth.format(convertedTemperature) +
                        " in R";
                tvResult.setText(result);

            }
        });
        convertn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(ThirdActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-32) *(7/24)+ 7.5;
                result = temperatureEnted + "F" + " is " + tenth.format(convertedTemperature) +
                        " in °Ro";
                tvResult.setText(result);

            }
        });
    status.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        if (entTemperature.getText().toString().isEmpty()) {
        Toast.makeText(ThirdActivity.this, "Temperature is requested!",
        Toast.LENGTH_LONG).show();
        return;
        }
        double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());


        String res = "";
        DecimalFormat tenth = new DecimalFormat("#.#");

    if (temperatureEnted <32) {
        res = "Extremely cold";

    } else if (temperatureEnted == 32) {
        res = "Freezing Point of Water";

    } else if (temperatureEnted > 32&& temperatureEnted < 69.8) {
        res = "Cold";
    } else if (temperatureEnted == 69.8) {
        res = "Room Temperature";
    } else if (temperatureEnted > 69.8 && temperatureEnted < 98.6) {
        res = "Beach weather";
    } else if (temperatureEnted == 98.6) {
        res = "Body temperature";
    } else if (temperatureEnted > 98.6 && temperatureEnted < 212) {
        res = "Hot";
    } else if (temperatureEnted == 212) {
        res = "Boiling Point of water";
    }
    else if (temperatureEnted> 212) {
        res = "Extremely hot";
    }


        weResult.setText(res);

        }
        });
        }
        }




