package com.example.administrator.formsapp;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/18.
 */

public class CommonDataUnit extends DataSupport implements Serializable {
    String company = "";
    String address = "";
    String person = "";
    String time = "";
    private Common_Model[] models = new Common_Model[9];

    public CommonDataUnit(){
        int i = 0;
        while(i < 9){
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
