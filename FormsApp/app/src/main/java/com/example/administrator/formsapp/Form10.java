package com.example.administrator.formsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

/**
 * Created by Administrator on 2017/7/6.
 */

public class Form10 extends Activity {
    private TabHost mTabHost = null;
    private TabHost mTabhost1 = null;
    private TabHost mTabhost2 = null;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form10);
        mTabHost = (TabHost)findViewById(R.id.tabHost);
        mTabhost1 = (TabHost)findViewById(R.id.tabhost1);
        mTabhost2 = (TabHost)findViewById(R.id.tabhost2);
        mTabHost.setup();
        mTabhost1.setup();
        mTabhost2.setup();
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time1").setIndicator("气").setContent(R.id.tab1));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time2").setIndicator("水").setContent(R.id.tab2));
        mTabhost1.addTab(mTabhost1.newTabSpec("Tab Time11").setIndicator("Q1").setContent(R.id.tab11));
        mTabhost1.addTab(mTabhost1.newTabSpec("Tab Time12").setIndicator("Q2").setContent(R.id.tab12));
        mTabhost2.addTab(mTabhost2.newTabSpec("Tab Time21").setIndicator("Q1").setContent(R.id.tab21));
        mTabhost2.addTab(mTabhost2.newTabSpec("Tab Time22").setIndicator("Q2").setContent(R.id.tab22));
        mTabhost2.addTab(mTabhost2.newTabSpec("Tab Time23").setIndicator("Q3").setContent(R.id.tab23));
        mTabhost2.addTab(mTabhost2.newTabSpec("Tab Time24").setIndicator("Q4").setContent(R.id.tab24));
        mTabhost2.addTab(mTabhost2.newTabSpec("Tab Time25").setIndicator("Q5").setContent(R.id.tab25));

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form10.this, Form11.class);
                startActivity(intent);
                finish();
            }
        });

    }
}

