package com.example.bikersskaters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    private Button mRideButton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mRideButton = (Button) findViewById(R.id.rideButton);
                    mRideButton.setOnClickListener(new View.OnClickListener(){


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this , LoginActivity.class);
        startActivity(intent);
    }
                    });

        }
}



