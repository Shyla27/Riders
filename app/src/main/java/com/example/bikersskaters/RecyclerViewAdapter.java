package com.example.bikersskaters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
private static final String TAG = "RecyclerViewAdapter";
//variables

//   DashboardActivity mNames = new DashboardActivity();
    private ArrayList<Integer> mImages;
    private ArrayList<String> mNames;

    Context mContext;


    public RecyclerViewAdapter(ArrayList<String> mNames, ArrayList<Integer> mImages, Context mContext) {
        this.mNames = mNames;
        this.mImages = mImages;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder:called.");
        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
Log.d(TAG, "onBindViewHolder:called.");
        Glide.with(mContext)
                .load(mImages.get(position))
                .into(holder.imageView);

        holder.name.setText(mNames.get(position));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "o nClick:clicked on an image: " + mNames.get(position));
                Toast.makeText( mContext, mNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {


        CircleImageView imageView;
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            name = itemView.findViewById(R.id.name);
        }
    }
}
