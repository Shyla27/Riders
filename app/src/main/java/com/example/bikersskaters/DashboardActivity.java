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
@BindView(R.id.nav_chats) TextView nav_chats;
@BindView(R.id.nav_add) TextView nav_add;
@BindView(R.id.nav_profile) TextView nav_profile;
@BindView(R.id.nav_home) TextView nav_home;
@BindView(R.id.nav_search) TextView nav_search;

    List<String> stringList;
    //variables
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();

    private void initImageBitMaps() {
        Log.d(TAG, "initImageBitmaps:preparing bitmaps.");

        mImages.add("https://www.c5alliance.com/latest/c5-cycle-challenge-2019/");
        mNames.add("JoshMan");

        mImages.add("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjT8vC-2_XmAhUNmBQKHSiBABMQjRx6BAgBEAQ&url=https%3A%2F%2Fwww.thealdertonswan.co.uk%2F2016%2F11%2F16%2Fteam-itfc-tour-suffolk-cycle-challenge%2Fsunny-cycling-2%2F&psig=AOvVaw3Jk4iiI3u1VsKTZqmksCyY&ust=1578631682693521");
        mNames.add("JoshMan");

        mImages.add("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwiDraHt2_XmAhVFDWMBHRDxDecQjRx6BAgBEAQ&url=https%3A%2F%2Fwww.byawoman.com%2Fa-board-on-wheels-gives-kenyan-urban-youth-skill-hope%2F&psig=AOvVaw14K-JzJo3zGDJMd_psJV3G&ust=1578631787790410");
        mNames.add("JoshMan");

        mImages.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjuyLGK3PXmAhXHDWMBHSpCBLoQjRx6BAgBEAQ&url=%2Furl%3Fsa%3Di%26source%3Dimages%26cd%3D%26ved%3D2ahUKEwiSnIP-2_XmAhWHDxQKHR6lA0UQjRx6BAgBEAQ%26url%3Dhttps%253A%252F%252Fwww.dreamstime.com%252Fstock-photo-skateboard-kid-image15943170%26psig%3DAOvVaw14K-JzJo3zGDJMd_psJV3G%26ust%3D1578631787790410&psig=AOvVaw14K-JzJo3zGDJMd_psJV3G&ust=1578631787790410");
        mNames.add("JoshMan");

        mImages.add("");
        mNames.add("JoshMan");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initrecyclerView");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView= findViewById(R.id.recycler);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames,mImages);
        recyclerView.setAdapter(adapter);
    }


    private static final String TAG = "DashboardActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_dashboard);
        ButterKnife.bind(this);

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
