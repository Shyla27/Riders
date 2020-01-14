package com.example.bikersskaters.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bikersskaters.R;

public class ProfileActivity  extends AppCompatActivity {

    private Button mSignin;
    private Button mSignup;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mSignin = (Button) findViewById(R.id.signin);
        mSignup = (Button) findViewById(R.id.signup);

        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == mSignin) {
                    Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                    startActivity(intent);

                } else if (v == mSignup) {
                    Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                    startActivity(intent);

                }
            }
        });


    }

}