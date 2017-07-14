package com.example.administrator.formsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

import java.util.List;

/**
 * Created by Administrator on 2017/7/5.
 */

public class Form2 extends AppCompatActivity{
    private TabHost mTabHost = null;
    private TabHost mTabhost = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form2);
        mTabHost = (TabHost)findViewById(R.id.tabHost);
        mTabhost = (TabHost)findViewById(R.id.tabhost);
        mTabHost.setup();
        mTabhost.setup();
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time1").setIndicator("环保手续").setContent(R.id.tab1));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time2").setIndicator("其他企业行政审批").setContent(R.id.tab2));
        mTabhost.addTab(mTabhost.newTabSpec("Tab Time21").setIndicator("安全生产许可证").setContent(R.id.tab21));
        mTabhost.addTab(mTabhost.newTabSpec("Tab Time22").setIndicator("危险化学品重大危险源备案").setContent(R.id.tab22));
        mTabhost.addTab(mTabhost.newTabSpec("Tab Time23").setIndicator("消防验收").setContent(R.id.tab23));

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form2.this, Form3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
