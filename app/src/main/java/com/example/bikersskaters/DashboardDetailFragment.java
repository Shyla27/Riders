package com.example.bikersskaters;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardDetailFragment extends Fragment {
   // @BindView(R.id.tv_heading) TextView mHeadingTextView;
    private String heading;


    public DashboardDetailFragment() {
        // Required empty public constructor
    }

    public static void newInstance(String heading) {
        DashboardDetailFragment dashboardDetailFragment = new DashboardDetailFragment();
        Bundle args = new Bundle();
//        args.putParcelable("heading", Parcelable.wrap(heading));
//        DashboardDetailFragment.setArg
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard_detail, container, false);
    }

}
