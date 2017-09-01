package com.example.admin.ChildFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.detailsfragmentlandscap.R;

/**
 * Created by Admin on 8/31/2017.
 */

public class FragmentTab1 extends Fragment {
    public FragmentTab1(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab1_demo, container, false);

        return view;
    }
}
