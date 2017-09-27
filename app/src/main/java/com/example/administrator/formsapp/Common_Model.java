package com.example.administrator.formsapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/18.
 */

public class Common_Model implements Serializable {
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count = 10;
    private int[] choice = new int[10];
    private String[] description = new String[10];
    private byte[][] picture = new byte[10][];

    String[][] text = new String[6][3];

    public String[][] getText() {
        return text;
    }

    public void setText(String[][] text) {
        this.text = text;
    }

    public String[] getText(int i) {
        if(i >= 6 || i < 0){
            return null;
        }
        return text[i];
    }

    public void setText(int i, String[] text) {
        if(i < 6 && i >= 0) {
            this.text[i] = text;
        }
    }


    public String[] getLack_project() {
        return lack_project;
    }
    public String getLack_project(int i){
        if(i < 0 || i >= 10){
            return null;
        }
        return lack_project[i];
    }

    public void setLack_project(String[] lack_project) {
        this.lack_project = lack_project;
    }
    public void setLack_project(int i, String value){
        if(i >= 0 && i < 10){
            lack_project[i] = value;
        }
    }

    private String[] lack_project = new String[10];

    public Common_Model(){
        int i = 0;
        while(i < 10){
            choice[i] = -1;
            description[i] = "";
            lack_project[i] = "";
            i ++;
        }

        int m = 0, n = 0;
        while (m < 6){
            n = 0;
            while(n < 3){
                text[m][n] = "";
                n ++;
            }
            m ++;
        }

    }

    public Common_Model(int size){
        int i = 0;
        count = size;
        while(i < count){
            choice[i] = -1;
            description[i] = "";
            lack_project[i] = "";
            i ++;
        }

        int m = 0, n = 0;
        while (m < 6){
            n = 0;
            while(n < 3){
                text[m][n] = "";
                n ++;
            }
            m ++;
        }

    }


    public String[] getDescription() {
        return description;
    }

    public String getDescription(int i) {
        if(i >= count || i < 0){
            return null;
        }
        return description[i];
    }

    public void setChoice(int[] choice) {
        this.choice = choice;
    }

    public void setChoice(int i, int value){
        if(i < count && i >= 0){
            choice[i] = value;
        }
    }

    public int[] getChoice() {
        return choice;
    }

    public int getChoice(int i){
        if(i >= count || i < 0){
            return -1;
        }
        return choice[i];
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public void setDescription(int i, String value){
        if(i < count && i >= 0){
            description[i] = value;
        }
    }

    public void setPicture(byte[][] picture) {
        this.picture = picture;
    }

    public void setPicture(int i, Bitmap bitmap) {
        if(i < count && i >= 0){
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, baos);//压缩位图
            picture[i] = baos.toByteArray();//创建分配字节数组
        }
    }

    public Bitmap getPicture(int i){
        if(i < 0 || i >= count || picture[i] == null || picture[i].length == 0){
            return  null;
        }
        return BitmapFactory.decodeByteArray(picture[i], 0, picture[i].length);
    }
    public byte[][] getPicture() {
        return picture;
    }


}

