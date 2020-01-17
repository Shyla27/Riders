package com.example.bikersskaters.ui.slideshow;

import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bikersskaters.R;

import butterknife.BindView;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Check out my Collection");

    }

    public LiveData<String> getText() {
        return mText;
    }
}