package com.example.bikersskaters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.bikersskaters.ui.ChatFragment;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
@BindView(R.id.nav_chats) TextView nav_chats;
@BindView(R.id.nav_add) TextView nav_add;
@BindView(R.id.nav_profile) TextView nav_profile;
@BindView(R.id.nav_home) TextView nav_home;
@BindView(R.id.nav_search) TextView nav_search;

    List<String> stringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_dashboard);
        ButterKnife.bind(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(DashboardActivity.this, ChatFragment.class);
        startActivity(intent);

    }
}
