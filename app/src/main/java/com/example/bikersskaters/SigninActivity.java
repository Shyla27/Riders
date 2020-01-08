package com.example.bikersskaters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity  extends AppCompatActivity {

   private Button mcreateButton ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mcreateButton= (Button) findViewById(R.id.createButton);
        mcreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SigninActivity.this, "Welcome" ,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SigninActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });







    }
}