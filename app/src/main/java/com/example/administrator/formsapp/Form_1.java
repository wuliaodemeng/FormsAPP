package com.example.administrator.formsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/7/12.
 */

public class Form_1 extends AppCompatActivity {
    String address = "";
    String company = "";
    int choice = -1;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_1);
        Button button = (Button)findViewById(R.id.button);
        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                company = editable.toString();
            }
        });

        EditText editText2 = (EditText)findViewById(R.id.editText2);
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                address = editable.toString();
            }
        });

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.type);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.first:
                        choice = 1;
                        break;
                    case R.id.second:
                        choice = 2;
                        break;
                    case R.id.third:
                        choice = 3;
                        break;
                    default:
                        choice = -1;
                        break;
                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                if(choice == 1){
                    intent = new Intent(Form_1.this, CommonList.class);
                }
                if(choice == 2){
                    intent = new Intent(Form_1.this, MiningList.class);
                }
                if(choice == 3){
                    intent = new Intent(Form_1.this, Form_2.class);
                }
                if(choice != -1){
                    intent.putExtra("company", company);
                    intent.putExtra("address", address);
                    startActivity(intent);
                }

            }
        });

    }





}
