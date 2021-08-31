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
public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText entTemperature = (EditText) findViewById(R.id.entTemperature);
        Button convertc = (Button) findViewById(R.id.convertc);
        Button convertf = (Button) findViewById(R.id.convertf);
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
                    Toast.makeText(FourActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted )-273.5;
                result = temperatureEnted + " K" + " is " + tenth.format(convertedTemperature) +
                        " in C";
                tvResult.setText(result);
            }
        });

        convertf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FourActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-273.15)*9/5+32 ;
                result = temperatureEnted + "K" + " is " + tenth.format(convertedTemperature) +
                        " in F";
                tvResult.setText(result);
            }
        });

        convertr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FourActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted) * 1.8;
                result = temperatureEnted + "K" + " is " + tenth.format(convertedTemperature) +
                        " in R";
                tvResult.setText(result);
            }
        });
        convertn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FourActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-273.15) *(21/40)+ 7.5;
                result = temperatureEnted + "K" + " is " + tenth.format(convertedTemperature) +
                        " in °Ro";
                tvResult.setText(result);
            }
        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FourActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());


                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");
                if (temperatureEnted <273.2) {
                    res = "Extremely cold";

                }else if (temperatureEnted == 273.2) {
                    res = "Freezing Point of Water";

                } else if (temperatureEnted > 273.2 && temperatureEnted < 294.2) {
                    res = "Cold";
                } else if (temperatureEnted == 294.2) {
                    res = "Room Temperature";
                } else if (temperatureEnted > 294.2 && temperatureEnted < 310.2) {
                    res = "Beach weather";
                } else if (temperatureEnted == 310.2) {
                    res = "Body temperature";
                } else if (temperatureEnted > 310.2 && temperatureEnted < 373.2) {
                    res = "Hot";
                } else if (temperatureEnted == 373.2) {
                    res = "Boiling Point of water";
                }
                else if (temperatureEnted >373.2) {
                    res = "Extremely hot";
                }
                weResult.setText(res);

            }
        });
    }
}



