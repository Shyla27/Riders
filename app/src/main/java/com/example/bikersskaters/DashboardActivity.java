package com.example.bikersskaters;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.bikersskaters.ui.ChatFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
//@BindView(R.id.nav_chats) TextView nav_chats;
//@BindView(R.id.nav_add) TextView nav_add;
//@BindView(R.id.nav_profile) TextView nav_profile;
//@BindView(R.id.nav_home) TextView nav_home;
//@BindView(R.id.nav_search) TextView nav_search;

//    List<String> stringList=new ArrayList<>();
    //variables
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImages = new ArrayList<>();

    private void initImageBitMaps() {
        Log.d(TAG, "initImageBitmaps:preparing bitmaps.");

        mImages.add(R.drawable.bike);
        mNames.add("JoshMan");

    mImages.add(R.drawable.bl);
    mNames.add("Burny");

        mImages.add(R.drawable.original);
        mNames.add("Skater");

        mImages.add(R.drawable.vans);
        mNames.add("Dee");

        mImages.add(R.drawable.ken);
        mNames.add("Ken");

        mImages.add(R.drawable.lady);
        mNames.add("Mani");
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initrecyclerView");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView= findViewById(R.id.recycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( mNames,mImages,DashboardActivity.this);
        recyclerView.setAdapter(adapter);
        initImageBitMaps();
    }


    private static final String TAG = "DashboardActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_dashboard);
        ButterKnife.bind(this);
        initRecyclerView();

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
        startActivity(intent);

    }

    public int get(int position) {
        return 0;
    }
}
