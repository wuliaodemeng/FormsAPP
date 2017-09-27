package com.example.administrator.formsapp;

import android.util.Log;
import android.widget.Toast;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

import static org.litepal.LitePalBase.TAG;

/**
 * Created by Administrator on 2017/8/18.
 */

public class MiningDataUnit extends DataSupport implements Serializable {
    String company = "";
    String address = "";
    String person = "";
    String time = "";
    private Common_Model[] models = new Common_Model[13];

    public MiningDataUnit(){
        int i = 0;
        while(i < 13){
            models[i] = new Common_Model();
            i ++;
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public Common_Model[] getModels() {
        return models;
    }

    public void setModels(Common_Model[] models) {
        this.models = models;
    }


    public Common_Model getModels(int i){
        return models[i];
    }

    public void setModels(int i, Common_Model models) {
        this.models[i] = models;

    }

}
