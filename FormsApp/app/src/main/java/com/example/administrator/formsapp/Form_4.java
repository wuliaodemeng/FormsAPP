package com.example.administrator.formsapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.tabs;

/**
 * Created by Administrator on 2017/7/13.
 */

public class Form_4 extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    TabPagerAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_4);
        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tabLayout = (TabLayout)findViewById(R.id.tablayout);

        viewPager = (ViewPager)findViewById(R.id.viewpager);

        adapter = new TabPagerAdapter(getSupportFragmentManager());
        TabFragment tab1 = new TabFragment();
        TabFragment tab2 = new TabFragment();
        TabFragment tab3 = new TabFragment();
        tab1.setResource(R.layout.model2_tab1);
        tab2.setResource(R.layout.model2_tab2);
        tab3.setResource(R.layout.model2_tab3);

        adapter.addFragment(tab1);
        adapter.addFragment(tab2);
        adapter.addFragment(tab3);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        Drawable drawable;
        drawable = ContextCompat.getDrawable(Form_4.this, R.drawable.cur_page);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        tab.setIcon(drawable);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        Drawable drawable;
        drawable = ContextCompat.getDrawable(Form_4.this, R.drawable.other_page);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        tab.setIcon(drawable);
    }


    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public class TabPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> mFragments = new ArrayList<>();

        public TabPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        public void addFragment(Fragment fragment) {
            mFragments.add(fragment);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            Drawable drawable;
            drawable = ContextCompat.getDrawable(Form_4.this, R.drawable.other_page);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            ImageSpan imageSpan = new ImageSpan(drawable, ImageSpan.ALIGN_BOTTOM);
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            return spannableString;
        }


    }


}