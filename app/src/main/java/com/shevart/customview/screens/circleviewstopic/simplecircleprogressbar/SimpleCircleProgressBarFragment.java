package com.shevart.customview.screens.circleviewstopic.simplecircleprogressbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shevart.customview.R;

public class SimpleCircleProgressBarFragment extends Fragment {
    public SimpleCircleProgressBarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_circle_progress_bar, container, false);
    }

}
