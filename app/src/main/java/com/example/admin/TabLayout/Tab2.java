package com.example.admin.TabLayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.detailsfragmentlandscap.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment {

    private ListView lvSubject;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> list;


    public Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        addControls(view);
        addEvents();

        return view;
    }

    private void addEvents() {
        lvSubject.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getFragmentManager().beginTransaction().replace(R.id.frame_layout_for_tab_fragment, new Tab2()).commit();
            }
        });
    }

    private void addControls(View view) {
        lvSubject = view.findViewById(R.id.lvSubject);

        list = new ArrayList<>();
        addObjects();

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);

        lvSubject.setAdapter(adapter);
    }

    private void addObjects() {
        String [] nameOfSubject = new String[]{"Toán","Hóa","Sinh","Anh","Văn", "Ly", "Su", "Dia"};
        for (String name : nameOfSubject) {
            list.add(name);
        }
    }

}
