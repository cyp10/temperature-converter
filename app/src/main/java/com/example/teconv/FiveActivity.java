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
public class FiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText entTemperature = (EditText) findViewById(R.id.entTemperature);
        Button convertc = (Button) findViewById(R.id.convertc);
        Button convertf = (Button) findViewById(R.id.convertf);
        Button convertk = (Button) findViewById(R.id.convertk);
        Button convertn = (Button) findViewById(R.id.convertn);
        Button status = (Button) findViewById(R.id.status);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        final TextView weResult = (TextView) findViewById(R.id.weResult);

        Intent i = getIntent();

        convertc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FiveActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-491.67)*5/9;
                result = temperatureEnted + "R" + " is " + tenth.format(convertedTemperature) +
                        " in C";
                tvResult.setText(result);
            }
        });

        convertf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FiveActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-459.67);
                result = temperatureEnted + "R" + " is " + tenth.format(convertedTemperature) +
                        " in F";
                tvResult.setText(result);
            }
        });

        convertk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FiveActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted)*5/9;
                result = temperatureEnted + "R" + " is " + tenth.format(convertedTemperature) +
                        " in K";
                tvResult.setText(result);
            }
        });
        convertn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FiveActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());

                String result = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                double convertedTemperature = (temperatureEnted-491.67) *(7/24)+ 7.5;
                result = temperatureEnted + "R" + " is " + tenth.format(convertedTemperature) +
                        " in °Ro";
                tvResult.setText(result);
            }
        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entTemperature.getText().toString().isEmpty()) {
                    Toast.makeText(FiveActivity.this, "Temperature is requested!",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                double temperatureEnted = Double.parseDouble(entTemperature.getText().toString());


                String res = "";
                DecimalFormat tenth = new DecimalFormat("#.#");


                if (temperatureEnted < 491.7) {
                    res = "Extremely cold ";
                } else if (temperatureEnted == 491.7) {
                    res = "Freezing Point of Water";

                } else if (temperatureEnted > 491.7 && temperatureEnted < 529.5) {
                    res = "Cold";
                } else if (temperatureEnted == 529.5) {
                    res = "Room Temperature";
                } else if (temperatureEnted > 529.5 && temperatureEnted < 558.3) {
                    res = "Beach weather";
                } else if (temperatureEnted == 558.3) {
                    res = "Body temperature";
                } else if (temperatureEnted > 558.3 && temperatureEnted < 671.7) {
                    res = "Hot";
                } else if (temperatureEnted == 671.7) {
                    res = "Boiling Point of water";
                }
                else if (temperatureEnted >671.7) {
                    res = "Extremely hot";
                }
                weResult.setText(res);

            }
        });
    }
}



