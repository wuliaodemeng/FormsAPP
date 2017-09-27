package com.example.administrator.formsapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/12.
 */

public class Form_0 extends AppCompatActivity implements TabFragment.CallBackValue{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    TabPagerAdapter adapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_0);

        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager);

        adapter = new TabPagerAdapter(getSupportFragmentManager());
        TabFragment tab1 = new TabFragment();
        TabFragment tab2 = new TabFragment();
        tab1.setResource(R.layout.tab1);
        tab2.setResource(R.layout.tab2);

        adapter.addFragment(tab1, "系统评估");
        adapter.addFragment(tab2, "历史数据");
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        onStart();


    }

    public class TabPagerAdapter extends FragmentPagerAdapter{

        private List<Fragment> mFragments = new ArrayList<>();
        private List<String> mTitles = new ArrayList<>();

        public TabPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mTitles.add(title);
        }

        @Override
        public int getCount() {
            return mTitles.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles.get(position);
        }


    }

    public void setIndicator(TabLayout tabs, int leftDip, int rightDip) {
        Class<?> tabLayout = tabs.getClass();
        Field tabStrip = null;
        try {
            tabStrip = tabLayout.getDeclaredField("mTabStrip");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        tabStrip.setAccessible(true);
        LinearLayout llTab = null;
        try {
            llTab = (LinearLayout) tabStrip.get(tabs);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, leftDip, Resources.getSystem().getDisplayMetrics());
        int right = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, rightDip, Resources.getSystem().getDisplayMetrics());

        for (int i = 0; i < llTab.getChildCount(); i++) {
            View child = llTab.getChildAt(i);
            child.setPadding(0, 0, 0, 0);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
            params.leftMargin = left;
            params.rightMargin = right;
            child.setLayoutParams(params);
            child.invalidate();
        }
    }


    @Override
    public void onStart() {
        super.onStart();
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                setIndicator(tabLayout,24,110);
            }
        });
    }

    public void SendChoice(int choice, int i){

    }
    public void SendLackProject(String lack_project, int i){

    }
    public void SendDescription(String description, int i){

    }
    public void SendPicture(Bitmap picture, int i){

    }

    @Override
    public void SendText(String[] text, int i) {

    }
}
