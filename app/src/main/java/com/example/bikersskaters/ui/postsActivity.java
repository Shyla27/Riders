package com.example.bikersskaters.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.brouding.doubletaplikeview.DoubleTapLikeView;
import com.example.bikersskaters.R;
import com.example.bikersskaters.RecyclerViewAdapter;

import java.util.ArrayList;

//import static com.example.bikersskaters.R.id.doubletap;


public class postsActivity extends AppCompatActivity {


    private static final String TAG = "postsActivity";
    SearchView mysearch;
ListView myList;

ArrayList<String> list;
ArrayAdapter<String> adapter;




    private ArrayList<Integer> mImages;
    private ArrayList<String> mNames;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        mysearch= (SearchView)findViewById(R.id.action_search);
        myList= (ListView)findViewById(R.id.listMode);

        list = new ArrayList<String>();


        list.add("Shyla");
        list.add("ken");
        list.add("Peace");
        list.add("Burny");
        list.add("Rookie");
        list.add("Asha");
        list.add("Star");



        adapter = new ArrayAdapter<>(this, R.layout.layout_listitem, list);
        myList.setAdapter(adapter);

        mysearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmps.");

        mImages.add(R.drawable.usiku);
        mNames.add("Shyla");


        mImages.add(R.drawable.usiku);
        mNames.add("ken");

        mImages.add(R.drawable.vans);
        mNames.add("Peace");

        mImages.add(R.drawable.lady);
        mNames.add("Burny");

        mImages.add(R.drawable.shad);
        mNames.add("Rookie");

        mImages.add(R.drawable.bl);
        mNames.add("Asha");

        mImages.add(R.drawable.ken);
        mNames.add("Star");

        mImages.add(R.drawable.bike);
        mNames.add("skater");

        initRecyclerView();
    }
     private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview" );
         LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,  false);
         RecyclerView recyclerView = findViewById(R.id.recyclerView);
         recyclerView.setLayoutManager(layoutManager);
         RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImages, this);
         recyclerView.setAdapter(adapter);
     }


}

