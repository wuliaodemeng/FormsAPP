package com.example.administrator.formsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;

/**
 * Created by Administrator on 2017/7/6.
 */

public class Form9 extends Activity{
    private TabHost mTabHost = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form9);
        mTabHost = (TabHost)findViewById(R.id.tabHost);
        mTabHost.setup();
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time1").setIndicator("化学品仓库").setContent(R.id.tab1));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time2").setIndicator("罐区").setContent(R.id.tab2));
        mTabHost.addTab(mTabHost.newTabSpec("Tab Time3").setIndicator("成品仓库(化学品)").setContent(R.id.tab3));

        Button takephoto1 = (Button)findViewById(R.id.take_photo1);
        Button choosePicture1 = (Button)findViewById(R.id.choose_picture1);
        ImageView picture1 = (ImageView)findViewById(R.id.picture1);

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form9.this, Form10.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
