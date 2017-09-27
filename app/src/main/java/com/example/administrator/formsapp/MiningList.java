package com.example.administrator.formsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/16.
 */

public class MiningList extends AppCompatActivity{
    MiningDataUnit formDataUnit = new MiningDataUnit();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mining_list);

        formDataUnit.setCompany(getIntent().getStringExtra("company"));
        formDataUnit.setAddress(getIntent().getStringExtra("address"));

        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formDataUnit.save();
                Intent intent = new Intent(MiningList.this, Form_0.class);
                startActivity(intent);
            }
        });



        ImageButton button1 = (ImageButton)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_1.class);
                intent.putExtra("model1", formDataUnit.getModels(0));
                startActivityForResult(intent, 1);
            }
        });


        TextView model_name1 = (TextView)findViewById(R.id.model_name1);

        model_name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_1.class);
                intent.putExtra("model1", formDataUnit.getModels(0));
                startActivityForResult(intent, 1);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_2.class);
                intent.putExtra("model2", formDataUnit.getModels(1));
                startActivityForResult(intent, 2);
            }
        });

        TextView model_name2 = (TextView)findViewById(R.id.model_name2);

        model_name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_2.class);
                intent.putExtra("model2", formDataUnit.getModels(1));
                startActivityForResult(intent, 2);
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_3.class);
                intent.putExtra("model3", formDataUnit.getModels(2));
                startActivityForResult(intent, 3);
            }
        });

        TextView model_name3 = (TextView)findViewById(R.id.model_name3);

        model_name3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_3.class);
                intent.putExtra("model3", formDataUnit.getModels(2));
                startActivityForResult(intent, 3);
            }
        });

        ImageButton button4 = (ImageButton)findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_4.class);
                intent.putExtra("model4", formDataUnit.getModels(3));
                startActivityForResult(intent, 4);
            }
        });

        TextView model_name4 = (TextView)findViewById(R.id.model_name4);

        model_name4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_4.class);
                intent.putExtra("model4", formDataUnit.getModels(3));
                startActivityForResult(intent, 4);
            }
        });

        ImageButton button5 = (ImageButton)findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_5.class);
                intent.putExtra("model5", formDataUnit.getModels(4));
                startActivityForResult(intent, 5);
            }
        });

        TextView model_name5 = (TextView)findViewById(R.id.model_name5);

        model_name5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_5.class);
                intent.putExtra("model5", formDataUnit.getModels(4));
                startActivityForResult(intent, 5);
            }
        });

        ImageButton button6 = (ImageButton)findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_6.class);
                intent.putExtra("model6", formDataUnit.getModels(5));
                startActivityForResult(intent, 6);
            }
        });

        TextView model_name6 = (TextView)findViewById(R.id.model_name6);

        model_name6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_6.class);
                intent.putExtra("model6", formDataUnit.getModels(5));
                startActivityForResult(intent, 6);
            }
        });

        ImageButton button7 = (ImageButton)findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Common_7.class);
                intent.putExtra("model7", formDataUnit.getModels(6));
                startActivityForResult(intent, 7);
            }
        });

        TextView model_name7 = (TextView)findViewById(R.id.model_name7);

        model_name7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_7.class);
                intent.putExtra("model7", formDataUnit.getModels(6));
                startActivityForResult(intent, 7);
            }
        });

        ImageButton button8 = (ImageButton)findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_8.class);
                intent.putExtra("model8", formDataUnit.getModels(7));
                startActivityForResult(intent, 8);
            }
        });

        TextView model_name8 = (TextView)findViewById(R.id.model_name8);

        model_name8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_8.class);
                intent.putExtra("model8", formDataUnit.getModels(7));
                startActivityForResult(intent, 8);
            }
        });

        ImageButton button9 = (ImageButton)findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_9.class);
                intent.putExtra("model9", formDataUnit.getModels(8));
                startActivityForResult(intent, 9);
            }
        });

        TextView model_name9 = (TextView)findViewById(R.id.model_name9);

        model_name9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_9.class);
                intent.putExtra("model9", formDataUnit.getModels(8));
                startActivityForResult(intent, 9);
            }
        });

        ImageButton button10 = (ImageButton)findViewById(R.id.button_10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_10.class);
                intent.putExtra("model10", formDataUnit.getModels(9));
                startActivityForResult(intent, 10);
            }
        });

        TextView model_name10 = (TextView)findViewById(R.id.model_name10);

        model_name10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_10.class);
                intent.putExtra("model10", formDataUnit.getModels(9));
                startActivityForResult(intent, 10);
            }
        });

        ImageButton button11 = (ImageButton)findViewById(R.id.button_11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_11.class);
                intent.putExtra("model11", formDataUnit.getModels(10));
                startActivityForResult(intent, 11);
            }
        });

        TextView model_name11 = (TextView)findViewById(R.id.model_name11);

        model_name11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_11.class);
                intent.putExtra("model11", formDataUnit.getModels(10));
                startActivityForResult(intent, 11);
            }
        });

        ImageButton button12 = (ImageButton)findViewById(R.id.button_12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_12.class);
                intent.putExtra("model12", formDataUnit.getModels(11));
                startActivityForResult(intent, 12);
            }
        });

        TextView model_name12 = (TextView)findViewById(R.id.model_name12);

        model_name12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_12.class);
                intent.putExtra("model12", formDataUnit.getModels(11));
                startActivityForResult(intent, 12);
            }
        });

        ImageButton button13 = (ImageButton)findViewById(R.id.button_13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_13.class);
                intent.putExtra("model13", formDataUnit.getModels(12));
                startActivityForResult(intent, 13);
            }
        });

        TextView model_name13 = (TextView)findViewById(R.id.model_name13);

        model_name13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MiningList.this, Mining_13.class);
                intent.putExtra("model13", formDataUnit.getModels(12));
                startActivityForResult(intent, 13);
            }
        });






    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(requestCode > 0 && requestCode <= 13 && resultCode == RESULT_OK){
            Common_Model temp = (Common_Model) data.getSerializableExtra("data_model" + requestCode);
            formDataUnit.setModels(requestCode-1, temp);
        }

        TextView perc1 = (TextView)findViewById(R.id.perc1);
        TextView perc2 = (TextView)findViewById(R.id.perc2);
        TextView perc3 = (TextView)findViewById(R.id.perc3);
        TextView perc4 = (TextView)findViewById(R.id.perc4);
        TextView perc5 = (TextView)findViewById(R.id.perc5);
        TextView perc6 = (TextView)findViewById(R.id.perc6);
        TextView perc7 = (TextView)findViewById(R.id.perc7);
        TextView perc8 = (TextView)findViewById(R.id.perc8);
        TextView perc9 = (TextView)findViewById(R.id.perc9);
        TextView perc10 = (TextView)findViewById(R.id.perc10);
        TextView perc11 = (TextView)findViewById(R.id.perc11);
        TextView perc12 = (TextView)findViewById(R.id.perc12);
        TextView perc13 = (TextView)findViewById(R.id.perc13);

        perc1.setText(GetPercent(formDataUnit.getModels(0).getChoice(), null, 4));
        String[] l = new String[1];
        l[0] = formDataUnit.getModels(1).getLack_project(2);
        perc2.setText(GetPercent(formDataUnit.getModels(1).getChoice(), l, 2));
        perc3.setText(GetPercent(formDataUnit.getModels(2).getChoice(), null, 3));
        perc4.setText(GetPercent(formDataUnit.getModels(3).getChoice(), null, 5));
        perc5.setText(GetPercent(formDataUnit.getModels(4).getChoice(), null, 7));
        perc6.setText(GetPercent(formDataUnit.getModels(5).getChoice(), null, 5));
        perc7.setText(GetPercent(formDataUnit.getModels(6).getChoice(), null, 6));

        perc8.setText(GetPercent(formDataUnit.getModels(7).getChoice(), null, 6));
        int[] k = new int[2];
        k[0] = formDataUnit.getModels(8).getChoice()[4];
        k[1] = formDataUnit.getModels(8).getChoice()[5];
        String[] ll = new String[4];
        ll[0] = formDataUnit.getModels(8).getLack_project()[0];
        ll[1] = formDataUnit.getModels(8).getLack_project()[1];
        ll[2] = formDataUnit.getModels(8).getLack_project()[2];
        ll[3] = formDataUnit.getModels(8).getLack_project()[3];
        perc9.setText(GetPercent(k, ll, 2));

        int[] kk = new int[5];
        kk[0] = formDataUnit.getModels(9).getChoice()[0];
        kk[1] = formDataUnit.getModels(9).getChoice()[1];
        kk[2] = formDataUnit.getModels(9).getChoice()[2];
        kk[3] = formDataUnit.getModels(9).getChoice()[3];
        kk[4] = formDataUnit.getModels(9).getChoice()[4];
        String[] lll = new String[2];
        lll[0] = formDataUnit.getModels(9).getLack_project()[5];
        lll[1] = formDataUnit.getModels(9).getLack_project()[6];
        perc10.setText(GetPercent(kk, lll, 5));
        int[] pp = new int[2];
        pp[0] = formDataUnit.getModels(10).getChoice()[1];
        pp[1] = formDataUnit.getModels(10).getChoice()[2];
        String[] p = new String[1];
        p[0] = formDataUnit.getModels(10).getLack_project(0);
        perc11.setText(GetPercent(pp, p, 2));

        int[] o = new int[3];
        String[] y = new String[6];
        o[0] = formDataUnit.getModels(11).getChoice()[0];
        o[1] = formDataUnit.getModels(11).getChoice()[1];
        o[2] = formDataUnit.getModels(11).getChoice()[2];
        y[0] = formDataUnit.getModels(11).getText(3)[0];
        y[1] = formDataUnit.getModels(11).getText(3)[1];
        y[2] = formDataUnit.getModels(11).getText(3)[2];
        y[3] = formDataUnit.getModels(11).getText(4)[0];
        y[4] = formDataUnit.getModels(11).getText(4)[1];
        y[5] = formDataUnit.getModels(11).getText(4)[2];
        perc12.setText(GetPercent(o, y, 3));
        perc13.setText(GetPercent(formDataUnit.getModels(12).getChoice(), null, 4));

    }

    private String GetPercent(int[] choice, String[] lack_project, int len){
        int i;
        double sum = 0, done = 0;
        if(choice != null){
            sum += len;
            for(i = 0; i < len; i ++){
                if(choice[i] != -1){
                    done ++;
                }
            }
        }
        if(lack_project != null){
            sum += lack_project.length;
            for(i = 0; i < lack_project.length; i ++){
                if(lack_project[i] != ""){
                    done ++;
                }
            }
        }
        int perc = (int)(done / sum * 100);
        String s = "" + perc + "%";
        return s;
    }

}
