package com.example.teconv;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.Teconv.R;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {


    private BreakIterator etTemperature;
    private Object view;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final TextView textView = findViewById(R.id.textView);
        final Button start = (Button) findViewById(R.id.start);
        final Button stop = (Button) findViewById(R.id.stop);
        final Button Celsius = (Button) findViewById(R.id.Celsius);
        final Button Fahrenheit = (Button) findViewById(R.id.Fahrenheit);
        final Button kelvin = (Button) findViewById(R.id.kelvin);
        final Button Rankein = (Button) findViewById(R.id.Rankin);
        final Button Romer = (Button) findViewById(R.id.Romer);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startService( new Intent(MainActivity.this, Music.class));
            }
        });

        Celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
        Fahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(i);
            }
        });
        kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, FourActivity.class);
                startActivity(i);
            }
        });
        Rankein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, FiveActivity.class);
                startActivity(i);
            }
        });
        Romer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, SixActivity.class);
                startActivity(i);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stopService( new Intent(MainActivity.this, Music.class));
            }
        });
    }
}