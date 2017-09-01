package com.example.admin.TabLayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.ChildFragment.FragmentTab1;
import com.example.admin.detailsfragmentlandscap.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1 extends Fragment {

    public ListView lvStudent;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> list;

    public Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab1, container, false);

        addControls(view);
        addEvents();

        return view;
    }

    private void addEvents() {
        lvStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getFragmentManager().beginTransaction().replace(R.id.frame_layout_for_tab_fragment, new Tab1()).commit();
            }
        });
    }

    private void addControls(View view) {
        lvStudent = view.findViewById(R.id.lvStudent);

        list = new ArrayList<>();
        addObjects();

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);

        lvStudent.setAdapter(adapter);
    }

    private void addObjects() {
        list.add("Tran Van A");
        list.add("Ho Thi B");
        list.add("Nguyen Cong C");
        list.add("Dao Duy Khanh");
        list.add("Trương Ngọc Dũng");
    }

}
