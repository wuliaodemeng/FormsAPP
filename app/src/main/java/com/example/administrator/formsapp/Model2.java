package com.example.administrator.formsapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/18.
 */

public class Model2 implements Serializable{
    private int[] choice = new int[2];
    private String lack_project = "";

    private String[] description = new String[3];
    private byte[][] picture = new byte[3][];
    public Model2(){
        choice[0] = -1;
        choice[1] = -1;
        description[0] = "";
        description[1] = "";
        description[2] = "";
    }

    public byte[][] getPicture() {
        return picture;
    }

    public void setLack_project(String lack_project) {
        this.lack_project = lack_project;
    }

    public String getLack_project() {
        return lack_project;
    }

    public Bitmap getPicture(int i){
        if(i < 0 || i >= 3 || picture[i] == null || picture[i].length == 0){
            return  null;
        }
        return BitmapFactory.decodeByteArray(picture[i], 0, picture[i].length);
    }

    public String[] getDescription() {
        return description;
    }

    public String getDescription(int i) {
        if(i >= 3 || i < 0){
            return null;
        }
        return description[i];
    }

    public void setChoice(int[] choice) {
        this.choice = choice;
    }

    public void setChoice(int i, int value){
        if(i < 2 && i >= 0){
            choice[i] = value;
        }
    }

    public int[] getChoice() {
        return choice;
    }

    public int getChoice(int i){
        if(i >= 2 || i < 0){
            return -1;
        }
        return choice[i];
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public void setDescription(int i, String value){
        if(i < 3 && i >= 0){
            description[i] = value;
        }
    }

    public void setPicture(byte[][] picture) {
        this.picture = picture;
    }

    public void setPicture(int i, Bitmap bitmap) {
        if(i < 3 && i >= 0){
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, baos);//压缩位图
            picture[i] = baos.toByteArray();//创建分配字节数组
        }
    }

}

