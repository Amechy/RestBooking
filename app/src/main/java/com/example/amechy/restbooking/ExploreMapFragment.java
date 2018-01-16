package com.example.amechy.restbooking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.SupportMapFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ExploreMapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExploreMapFragment extends SupportMapFragment {
    public ExploreMapFragment() {
    }

    public static ExploreMapFragment newInstance() {
        return new ExploreMapFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = super.onCreateView(inflater, container, savedInstanceState);

        return root;
    }



}
