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

public class Form7 extends Activity {
    private TabHost mTabHost = null;
    private TabHost mtabhost1 = null;
    private TabHost mtabhost2 = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form7);
        mTabHost = (TabHost)findViewById(R.id.tabHost);
        mtabhost1 = (TabHost)findViewById(R.id.tabhost1);
        mtabhost2 = (TabHost)findViewById(R.id.tabhost2);
        mTabHost.setup();
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time1").setIndicator("厂区内部环境状况").setContent(R.id.tab1));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time2").setIndicator("废气").setContent(R.id.tab2));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time3").setIndicator("废水").setContent(R.id.tab3));

        mtabhost1.setup();
        mtabhost1.addTab(mtabhost1.newTabSpec("Tab time21").setIndicator("Q1").setContent(R.id.tab21));
        mtabhost1.addTab(mtabhost1.newTabSpec("Tab time22").setIndicator("Q2").setContent(R.id.tab22));
        mtabhost2.setup();
        mtabhost2.addTab(mtabhost2.newTabSpec("Tab time31").setIndicator("Q1").setContent(R.id.tab31));
        mtabhost2.addTab(mtabhost2.newTabSpec("Tab time32").setIndicator("Q2").setContent(R.id.tab32));

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form7.this, Form8.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
