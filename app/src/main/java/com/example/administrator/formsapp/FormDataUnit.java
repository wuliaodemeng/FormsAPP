package com.example.administrator.formsapp;

import org.litepal.crud.DataSupport;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/18.
 */

public class FormDataUnit extends DataSupport implements Serializable{
    String company = "";
    String address = "";
    String person = "";
    String time = "";

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


    private Model1 model1 = new Model1();
    private Model2 model2 = new Model2();
    private Model3 model3 = new Model3();
    private Model4 model4 = new Model4();
    private Model5 model5 = new Model5();
    private Model6 model6 = new Model6();
    private Model7 model7 = new Model7();
    private Model8 model8 = new Model8();
    private Model9 model9 = new Model9();
    private Model10 model10 = new Model10();

    public Model1 getModel1() {
        return model1;
    }

    public Model2 getModel2() {
        return model2;
    }

    public Model3 getModel3() {
        return model3;
    }

    public Model4 getModel4() {
        return model4;
    }

    public Model5 getModel5() {
        return model5;
    }

    public Model6 getModel6() {
        return model6;
    }

    public Model7 getModel7() {
        return model7;
    }

    public Model8 getModel8() {
        return model8;
    }

    public Model9 getModel9() {
        return model9;
    }

    public Model10 getModel10() {
        return model10;
    }

    public void setModel1(Model1 model1) {
        this.model1 = model1;
    }

    public void setModel2(Model2 model2) {
        this.model2 = model2;
    }

    public void setModel3(Model3 model3) {
        this.model3 = model3;
    }

    public void setModel4(Model4 model4) {
        this.model4 = model4;
    }

    public void setModel5(Model5 model5) {
        this.model5 = model5;
    }

    public void setModel6(Model6 model6) {
        this.model6 = model6;
    }

    public void setModel7(Model7 model7) {
        this.model7 = model7;
    }

    public void setModel8(Model8 model8) {
        this.model8 = model8;
    }

    public void setModel9(Model9 model9) {
        this.model9 = model9;
    }

    public void setModel10(Model10 model10) {
        this.model10 = model10;
    }

}

