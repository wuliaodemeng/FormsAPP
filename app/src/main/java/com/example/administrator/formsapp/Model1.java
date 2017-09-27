package com.example.administrator.formsapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/18.
 */

public class Model1 implements Serializable{
    public int[] choice = new int[4];
    private String[] description = new String[4];

    public byte[][] getPicture() {
        return picture;
    }

    public void setPicture(byte[][] picture) {
        this.picture = picture;
    }

    private byte[][] picture = new byte[4][];

    public Model1(){
        choice[0] = -1;
        choice[1] = -1;
        choice[2] = -1;
        choice[3] = -1;
        description[0] = "";
        description[1] = "";
        description[2] = "";
        description[3] = "";
    }

    public void setPicture(int i,  Bitmap bitmap){
        //实例化字节数组输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, baos);//压缩位图
        picture[i] = baos.toByteArray();//创建分配字节数组
    }

    public Bitmap getPicture(int i){
        if(i < 0 || i >=  4 || picture[i] == null || picture[i].length == 0){
            return  null;
        }
        return BitmapFactory.decodeByteArray(picture[i], 0, picture[i].length);//从字节数组解码位图
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
        if(i >= 0 && i < 4){
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
        if(i >= 0 && i < 4){
            description[i] = value;
        }
    }



}
