package com.example.administrator.formsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2017/7/12.
 */

public class Form_2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_2);

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ImageButton button1 = (ImageButton)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_3.class);
                startActivity(intent);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_4.class);
                startActivity(intent);
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_5.class);
                startActivity(intent);
            }
        });

        ImageButton button4 = (ImageButton)findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_6.class);
                startActivity(intent);
            }
        });

        ImageButton button5 = (ImageButton)findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_7.class);
                startActivity(intent);
            }
        });

        ImageButton button6 = (ImageButton)findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_8.class);
                startActivity(intent);
            }
        });

        ImageButton button7 = (ImageButton)findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_9.class);
                startActivity(intent);
            }
        });

        ImageButton button8 = (ImageButton)findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_10.class);
                startActivity(intent);
            }
        });

        ImageButton button9 = (ImageButton)findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_11.class);
                startActivity(intent);
            }
        });

        ImageButton button10 = (ImageButton)findViewById(R.id.button_10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Form_2.this, Form_12.class);
                startActivity(intent);
            }
        });


    }
}
