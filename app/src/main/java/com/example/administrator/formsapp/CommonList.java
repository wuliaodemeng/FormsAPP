package com.example.administrator.formsapp;

import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/8/16.
 */

public class CommonList extends AppCompatActivity{
    CommonDataUnit formDataUnit = new CommonDataUnit();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_list);

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
                SendData(package_data());
                Intent intent = new Intent(CommonList.this, Form_0.class);
                startActivity(intent);
            }
        });



        ImageButton button1 = (ImageButton)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_1.class);
                intent.putExtra("model1", formDataUnit.getModels(0));
                startActivityForResult(intent, 1);
            }
        });


        TextView model_name1 = (TextView)findViewById(R.id.model_name1);

        model_name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_1.class);
                intent.putExtra("model1", formDataUnit.getModels(0));
                startActivityForResult(intent, 1);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_2.class);
                intent.putExtra("model2", formDataUnit.getModels(1));
                startActivityForResult(intent, 2);
            }
        });

        TextView model_name2 = (TextView)findViewById(R.id.model_name2);

        model_name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_2.class);
                intent.putExtra("model2", formDataUnit.getModels(1));
                startActivityForResult(intent, 2);
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_3.class);
                intent.putExtra("model3", formDataUnit.getModels(2));
                startActivityForResult(intent, 3);
            }
        });

        TextView model_name3 = (TextView)findViewById(R.id.model_name3);

        model_name3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_3.class);
                intent.putExtra("model3", formDataUnit.getModels(2));
                startActivityForResult(intent, 3);
            }
        });

        ImageButton button4 = (ImageButton)findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_4.class);
                intent.putExtra("model4", formDataUnit.getModels(3));
                startActivityForResult(intent, 4);
            }
        });

        TextView model_name4 = (TextView)findViewById(R.id.model_name4);

        model_name4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_4.class);
                intent.putExtra("model4", formDataUnit.getModels(3));
                startActivityForResult(intent, 4);
            }
        });

        ImageButton button5 = (ImageButton)findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_5.class);
                intent.putExtra("model5", formDataUnit.getModels(4));
                startActivityForResult(intent, 5);
            }
        });

        TextView model_name5 = (TextView)findViewById(R.id.model_name5);

        model_name5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_5.class);
                intent.putExtra("model5", formDataUnit.getModels(4));
                startActivityForResult(intent, 5);
            }
        });

        ImageButton button6 = (ImageButton)findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_6.class);
                intent.putExtra("model6", formDataUnit.getModels(5));
                startActivityForResult(intent, 6);
            }
        });

        TextView model_name6 = (TextView)findViewById(R.id.model_name6);

        model_name6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_6.class);
                intent.putExtra("model6", formDataUnit.getModels(5));
                startActivityForResult(intent, 6);
            }
        });

        ImageButton button7 = (ImageButton)findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_7.class);
                intent.putExtra("model7", formDataUnit.getModels(6));
                startActivityForResult(intent, 7);
            }
        });

        TextView model_name7 = (TextView)findViewById(R.id.model_name7);

        model_name7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_7.class);
                intent.putExtra("model7", formDataUnit.getModels(6));
                startActivityForResult(intent, 7);
            }
        });

        ImageButton button8 = (ImageButton)findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_8.class);
                intent.putExtra("model8", formDataUnit.getModels(7));
                startActivityForResult(intent, 8);
            }
        });

        TextView model_name8 = (TextView)findViewById(R.id.model_name8);

        model_name8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_8.class);
                intent.putExtra("model8", formDataUnit.getModels(7));
                startActivityForResult(intent, 8);
            }
        });

        ImageButton button9 = (ImageButton)findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_9.class);
                intent.putExtra("model9", formDataUnit.getModels(8));
                startActivityForResult(intent, 9);
            }
        });

        TextView model_name9 = (TextView)findViewById(R.id.model_name9);

        model_name9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonList.this, Common_9.class);
                intent.putExtra("model9", formDataUnit.getModels(8));
                startActivityForResult(intent, 9);
            }
        });




    }
    private JSONObject[] package_data(){
        JSONObject[] data = new JSONObject[43];
        int[] len = {4, 3, 3, 7, 5, 4, 6, 2, 4};
        ArrayList array = new ArrayList();

        for(int i = 0; i < 43; i ++){
            data[i] = new JSONObject();
        }
        try {
            int j = 0;
            for(int i = 0; i < 4; i++, j++) {
                data[j].put("value", formDataUnit.getModels(0).getChoice(i) - 1);
                data[j].put("revise_args", array);
            }
            for(int i = 0; i < 3; i++, j++){
                if(i < 2)data[j].put("value", formDataUnit.getModels(1).getChoice(i) - 1);
                else{
                    data[j].put("value", Integer.parseInt(formDataUnit.getModels(1).getLack_project(i)));
                }
                data[j].put("revise_agrs", array);
            }
            for(int i = 0; i < 3; i++, j++) {
                data[j].put("value", formDataUnit.getModels(2).getChoice(i) - 1);
                data[j].put("revise_args", array);
            }
            for(int i = 0; i < 7; i++, j++) {
                if(i != 0)data[j].put("value", formDataUnit.getModels(3).getChoice(i) - 1);
                else{
                    int[] c = GetN(formDataUnit.getModels(3).getChoice(0));
                    data[j].put("value", c);
                }
                data[j].put("revise_args", array);
            }
            for(int i = 0; i < 5; i++, j++) {
                data[j].put("value", formDataUnit.getModels(4).getChoice(i) - 1);
                data[j].put("revise_args", array);
            }
            for(int i = 0; i < 4; i++, j++) {
                data[j].put("value", formDataUnit.getModels(5).getChoice(i) - 1);
                data[j].put("revise_args", array);
            }
            for(int i = 0; i < 6; i++, j++) {
                data[j].put("value", formDataUnit.getModels(6).getChoice(i) - 1);
                data[j].put("revise_args", array);
            }
            for(int i = 0; i < 2; i++, j++) {
                data[j].put("value", formDataUnit.getModels(7).getChoice(i) - 1);
                data[j].put("revise_args", array);
            }
            data[34].put("value", formDataUnit.getModels(8).getChoice(0) - 1);
            data[34].put("revise_args", array);
            data[35].put("value", formDataUnit.getModels(8).getChoice(1));
            data[35].put("revise_args", array);

            for(int i = 0; i < 3; i ++){
                data[36 + i].put("value", Integer.parseInt(formDataUnit.getModels(8).getText(1)[i]));
                data[36 + i].put("revise_args", array);
            }
            for(int i = 0; i < 3; i ++){
                data[39 + i].put("value", Integer.parseInt(formDataUnit.getModels(8).getText(2)[i]));
                data[39 + i].put("revise_args", array);
            }
            data[42].put("value", formDataUnit.getModels(8).getChoice(3) - 1);
            data[42].put("revise_args", array);

        }catch (Exception e){
            e.printStackTrace();
        }

        return data;
    }

    private int[] GetN(int choice){
        int[] n = new int[4];
        n[0] = n[1] = n[2] = n[3] = 0;
        int i = 3;
        while(choice != 0 && i >= 0){
            n[i] = choice % 2;
            choice /= 2;
            i --;
        }
        return n;
    }


    private void SendData(final JSONObject[] data){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    OkHttpClient client = new OkHttpClient();

                    MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                    JSONObject obj = new JSONObject();
                    obj.put("category", 0);
                    JSONObject all_data = new JSONObject();
                    for(int i = 0; i < 43; i ++){
                        all_data.put("" + i, data[i]);
                    }
                    obj.put("result", all_data);

                    RequestBody body = RequestBody.create(JSON, obj.toString());
                    Log.i("Data__0", obj.toString());

                    Request request = new Request.Builder()
                            .url("http://www.ehsplus.cn:9000/v020")
                            .post(body)
                            .build();


                    Response response = client.newCall(request).execute();
                    String responseData = response.body().string();
                    ShowData(responseData);

                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }).start();

    }

    private void ShowData(String data){
        Log.i("CommonList", data);
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }


/*
    private void postJson() {
        //申明给服务端传递一个json串
        //创建一个OkHttpClient对象
        OkHttpClient okHttpClient = new OkHttpClient();
        //创建一个RequestBody(参数1：数据类型 参数2传递的json串)
        RequestBody requestBody = RequestBody.create(, "");
        //创建一个请求对象
        Request request = new VoiceInteractionSession.Request.Builder()
                .url("http://192.168.0.102:8080/TestProject/JsonServlet")
                .post(requestBody)
                .build();
        //发送请求获取响应
        try {
            Response response=okHttpClient.newCall(request).execute();
            //判断请求是否成功
            if(response.isSuccessful()){
                //打印服务端返回结果
                Log.i(TAG,response.body().string());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/


    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(requestCode > 0 && requestCode < 10 && resultCode == RESULT_OK){
            formDataUnit.setModels(requestCode-1, (Common_Model) data.getSerializableExtra("data_model" + requestCode));
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

        perc1.setText(GetPercent(formDataUnit.getModels(0).getChoice(), null, 4));
        String[] l = new String[1];
        l[0] = formDataUnit.getModels(1).getLack_project(2);
        perc2.setText(GetPercent(formDataUnit.getModels(1).getChoice(), l, 2));
        perc3.setText(GetPercent(formDataUnit.getModels(2).getChoice(), null, 3));
        perc4.setText(GetPercent(formDataUnit.getModels(3).getChoice(), null, 7));
        perc5.setText(GetPercent(formDataUnit.getModels(4).getChoice(), null, 5));
        perc6.setText(GetPercent(formDataUnit.getModels(5).getChoice(), null, 4));
        perc7.setText(GetPercent(formDataUnit.getModels(6).getChoice(), null, 6));
        perc8.setText(GetPercent(formDataUnit.getModels(7).getChoice(), null, 2));
        int[] cccc = new int[2];
        String[] t = new String[6];
        cccc[0] = formDataUnit.getModels(8).getChoice()[0];
        cccc[1] = formDataUnit.getModels(8).getChoice()[3];
        t[0] = formDataUnit.getModels(8).getText(1)[0];
        t[1] = formDataUnit.getModels(8).getText(1)[1];
        t[2] = formDataUnit.getModels(8).getText(1)[2];
        t[3] = formDataUnit.getModels(8).getText(2)[0];
        t[4] = formDataUnit.getModels(8).getText(2)[1];
        t[5] = formDataUnit.getModels(8).getText(2)[2];
        perc9.setText(GetPercent(cccc, t, 2));



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
                if(lack_project[i] != "" && lack_project[i] != " "){
                    done ++;
                }
            }
        }
        int perc = (int)(done / sum * 100);
        String s = "" + perc + "%";
        return s;
    }

}
