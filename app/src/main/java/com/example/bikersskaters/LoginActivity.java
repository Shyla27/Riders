package com.example.bikersskaters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    private Button mloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mloginButton = (Button)  findViewById(R.id.loginButton);

        mloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Welcome Back" ,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(LoginActivity.this , postsActivity.class);
                startActivity(intent);
            }
        });




    }
}

