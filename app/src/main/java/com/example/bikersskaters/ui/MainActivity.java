package com.example.bikersskaters.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bikersskaters.R;
import com.google.firebase.auth.ActionCodeSettings;


public class MainActivity<email, actionCodeSettings> extends AppCompatActivity  {

    private Button mRideButton;



    ActionCodeSettings actionCodeSettings = ActionCodeSettings.newBuilder()
            // URL you want to redirect back to. The domain (www.example.com) for this
            // URL must be whitelisted in the Firebase Console.
            .setUrl("https://www.example.com/finishSignUp?cartId=1234")
            // This must be true
            .setHandleCodeInApp(true)
            .setIOSBundleId("com.example.ios")
            .setAndroidPackageName(
                    "com.example.android",
                    true, /* installIfNotAvailable */
                    "12" /* minimumVersion */)
            .build();



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




