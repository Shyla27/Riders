package com.example.bikersskaters;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity {


    private Button msignupButton;
    @BindView(R.id.register) TextView mRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        msignupButton =(Button) findViewById(R.id.login);
        msignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
                Toast.makeText(LoginActivity.this, "Karibu", Toast.LENGTH_LONG).show();
            }
        });



    }
}

