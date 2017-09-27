package com.example.administrator.formsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("HelloWorldActivity", "onCreate execute");
        LitePal.getDatabase();

        Button button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(new LoginClickListener());
    }

    public class LoginClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            Intent intent = new Intent(MainActivity.this, Form_0.class);
            startActivity(intent);
        }
    }
}

