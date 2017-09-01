package com.example.admin.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.admin.TabLayout.Tab1;
import com.example.admin.TabLayout.Tab2;
import com.example.admin.TabLayout.Tab3;
import com.example.admin.TabLayout.Tab4;

/**
 * Created by Admin on 8/31/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter{

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1();
                break;
            case 1:
                fragment = new Tab2();
                break;
            case 2:
                fragment = new Tab3();
                break;
            case 3:
                fragment = new Tab4();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String s = null;
        switch (position) {
            case 0: s = "Tab1";
                break;
            case 1: s = "Tab2";
                break;
            case 2: s = "Tab3";
                break;
            case 3: s = "Tab4";
                break;
        }
        return s;
    }
}
