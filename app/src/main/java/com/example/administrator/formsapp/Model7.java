package com.example.administrator.formsapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/18.
 */

public class Model7 implements Serializable{
    private int[] choice = new int[4];
    private String[] lack_project = new String[4];

    private String[] description = new String[4];
    private byte[][] picture = new byte[4][];

    public Model7(){
        int i = 0;
        while(i < 4){
            choice[i++] = -1;
        }
        i = 0;
        while(i < 4){
            description[i++] = "";
        }

        i = 0;
        while(i < 4){
            lack_project[i++] = "";
        }
    }


    public void setLack_project(String[] lack_project) {
        this.lack_project = lack_project;
    }

    public void setLack_project(int i, String value) {
        if(i < 4 && i >= 0){
            lack_project[i] = value;
        }
    }
    public String[] getLack_project() {
        return lack_project;
    }

    public String getLack_project(int i){
        if(i >= 4 || i < 0){
            return null;
        }
        return lack_project[i];
    }

    public String[] getDescription() {
        return description;
    }

    public String getDescription(int i) {
        if(i >= 4 || i < 0){
            return null;
        }
        return description[i];
    }

    public void setChoice(int[] choice) {
        this.choice = choice;
    }

    public void setChoice(int i, int value){
        if(i < 4 && i >= 0){
            choice[i] = value;
        }
    }

    public int[] getChoice() {
        return choice;
    }

    public int getChoice(int i){
        if(i >= 4 || i < 0){
            return -1;
        }
        return choice[i];
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public void setDescription(int i, String value){
        if(i < 4 && i >= 0){
            description[i] = value;
        }
    }

    public void setPicture(byte[][] picture) {
        this.picture = picture;
    }

    public void setPicture(int i, Bitmap bitmap) {
        if(i < 4 && i >= 0){
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, baos);//压缩位图
            picture[i] = baos.toByteArray();//创建分配字节数组
        }
    }

    public Bitmap getPicture(int i){
        if(i < 0 || i >= 4 || picture[i] == null || picture[i].length == 0){
            return  null;
        }
        return BitmapFactory.decodeByteArray(picture[i], 0, picture[i].length);
    }
    public byte[][] getPicture() {
        return picture;
    }

}

