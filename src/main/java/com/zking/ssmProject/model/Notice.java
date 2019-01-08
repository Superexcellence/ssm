package com.zking.ssmProject.model;

public class Notice {
    private String notid;

    private String notbt;

    private String nottype;

    private String notren;

    private String notdate;

    public Notice(String notid, String notbt, String nottype, String notren, String notdate) {
        this.notid = notid;
        this.notbt = notbt;
        this.nottype = nottype;
        this.notren = notren;
        this.notdate = notdate;
    }

    public Notice() {
        super();
    }

    public String getNotid() {
        return notid;
    }

    public void setNotid(String notid) {
        this.notid = notid;
    }

    public String getNotbt() {
        return notbt;
    }

    public void setNotbt(String notbt) {
        this.notbt = notbt;
    }

    public String getNottype() {
        return nottype;
    }

    public void setNottype(String nottype) {
        this.nottype = nottype;
    }

    public String getNotren() {
        return notren;
    }

    public void setNotren(String notren) {
        this.notren = notren;
    }

    public String getNotdate() {
        return notdate;
    }

    public void setNotdate(String notdate) {
        this.notdate = notdate;
    }
}