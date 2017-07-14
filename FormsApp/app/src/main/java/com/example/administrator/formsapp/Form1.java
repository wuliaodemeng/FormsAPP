package com.example.administrator.formsapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import java.nio.file.DirectoryNotEmptyException;

/**
 * Created by Administrator on 2017/7/4.
 */

public class Form1 extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private String[] data = {"环保手续、其他企业行政审批", "环境风险管理制度", "企业五年内历史事故记录",
    "生产工艺", "设备及操作", "厂区内部环境状况、废气、废水", "固废、重点排污单位、生产装置（重点）", "储运系统", "厂区环境保护控制设施", "环境应急资源、企业周围环境"};

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form1);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Form1.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Intent intent = new Intent(Form1.this, demos[position].demoClass);
        startActivity(intent);

    }

    private static class DemoInfo{
        private final Class<? extends android.app.Activity> demoClass;
        public DemoInfo(Class<? extends android.app.Activity> demoClass){
            this.demoClass = demoClass;
        }
    }

    private static final DemoInfo[] demos = {
            new DemoInfo(Form2.class),
            new DemoInfo(Form3.class),
            new DemoInfo(Form4.class),
            new DemoInfo(Form5.class),
            new DemoInfo(Form6.class),
            new DemoInfo(Form7.class),
            new DemoInfo(Form8.class),
            new DemoInfo(Form9.class),
            new DemoInfo(Form10.class),
            new DemoInfo(Form11.class)
    };

}
