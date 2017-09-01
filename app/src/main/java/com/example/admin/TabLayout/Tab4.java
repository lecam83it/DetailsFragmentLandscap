package com.example.admin.TabLayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.detailsfragmentlandscap.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab4 extends Fragment {

    private TextView textView;

    public Tab4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab4, container, false);
        addControls(view);
        addEvents();

        return view;
    }

    private void addControls(View v) {
        textView = v.findViewById(R.id.txtFragment);
    }

    private void addEvents() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.frame_layout_for_tab_fragment, new Tab4()).commit();
            }
        });
    }

}
