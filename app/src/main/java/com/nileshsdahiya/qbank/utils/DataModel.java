package com.nileshsdahiya.qbank.utils;

public class DataModel {

    private int id;
    private String ques,ansa,ansb,ansc,ansd,ansr;

    public DataModel(int id, String ques, String ansa, String ansb, String ansc, String ansd, String ansr) {
        this.id = id;
        this.ques = ques;
        this.ansa = ansa;
        this.ansb = ansb;
        this.ansc = ansc;
        this.ansd = ansd;
        this.ansr = ansr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getAnsa() {
        return ansa;
    }

    public void setAnsa(String ansa) {
        this.ansa = ansa;
    }

    public String getAnsb() {
        return ansb;
    }

    public void setAnsb(String ansb) {
        this.ansb = ansb;
    }

    public String getAnsc() {
        return ansc;
    }

    public void setAnsc(String ansc) {
        this.ansc = ansc;
    }

    public String getAnsd() {
        return ansd;
    }

    public void setAnsd(String ansd) {
        this.ansd = ansd;
    }

    public String getAnsr() {
        return ansr;
    }

    public void setAnsr(String ansr) {
        this.ansr = ansr;
    }
}
