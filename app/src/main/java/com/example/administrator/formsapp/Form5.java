package com.example.administrator.formsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

import java.util.List;

/**
 * Created by Administrator on 2017/7/5.
 */

public class Form5 extends Activity {
    private TabHost mTabHost = null;
    private List<Fragment> list;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form5);
        mTabHost = (TabHost)findViewById(R.id.tabHost);
        mTabHost.setup();
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time1").setIndicator("Q1").setContent(R.id.tab1));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time2").setIndicator("Q2").setContent(R.id.tab2));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time3").setIndicator("Q3").setContent(R.id.tab3));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time4").setIndicator("Q4").setContent(R.id.tab4));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time5").setIndicator("Q5").setContent(R.id.tab5));

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form5.this, Form6.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
