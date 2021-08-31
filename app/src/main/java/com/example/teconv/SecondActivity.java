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
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText entTemperature = (EditText) findViewById(R.id.entTemperature);
        Button convertf = (Button) findViewById(R.id.convertc);
        Button convertk = (Button) findViewById(R.id.convertk);
        Button convertr = (Button) findViewById(R.id.convertr);
        Button convertn = (Button) findViewById(R.id.convertn);
        Button status = (Button) findViewById(R.id.status);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        final TextView weResult = (TextView) findViewById(R.id.weResult);

        Intent i = getIntent();


        convertf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SecondActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }


                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted * 9.0 / 5.0) +32;
                result = temperatureEnted + " C" + " is " + tenth.format(convertedTemperature) +
                        " in F";
                tvResult.setText(result);

            }
        });

        convertk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SecondActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted) + 273.15;
                result = temperatureEnted + " C" + " is " + tenth.format(convertedTemperature) +
                        " in K";
                tvResult.setText(result);

            }
        });

        convertr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SecondActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted * 9 / 5) + 491.67;
                result = temperatureEnted + " C" + " is " + tenth.format(convertedTemperature) +
                        " in R";
                tvResult.setText(result);

            }
        });
        convertn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SecondActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted * 21 / 40) + 7.5;
                result = temperatureEnted + " C" + " is " + tenth.format(convertedTemperature) +
                        " in °Ro";
                tvResult.setText(result);

            }
        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(SecondActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());


                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                if (temperatureEnted == -40) {
                    res = "Extremely cold";

                } else if (temperatureEnted > -40 && temperatureEnted < 0) {
                    res = "Very cold";
                } else if (temperatureEnted == 0) {
                    res = "Freezing Point of Water";

                } else if (temperatureEnted > 0 && temperatureEnted < 21) {
                    res = "Cold";
                } else if (temperatureEnted == 21) {
                    res = "Room Temperature";
                } else if (temperatureEnted > 21 && temperatureEnted < 37) {
                    res = "Beach weather";
                } else if (temperatureEnted == 37) {
                    res = "Body temperature";
                } else if (temperatureEnted > 37 && temperatureEnted < 100) {
                    res = "Hot";
                } else if (temperatureEnted == 100) {
                    res = "Boiling Point of water";
                }
                else if (temperatureEnted> 100) {
                    res = "Extremely hot";
                }
                weResult.setText(res);

            }
        });
    }
}



