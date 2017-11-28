package com.example.myapplication_daxueshengzaixian.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 齐天大圣 on 2017/11/27.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter{
    private ArrayList<Fragment> list;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list = list;
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

}
