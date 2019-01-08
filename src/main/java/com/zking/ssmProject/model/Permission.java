package com.zking.ssmProject.model;

public class Permission {
    private String perid;

    private String pername;

    private String pid;

    private String perurl;

    public Permission(String perid, String pername, String pid, String perurl) {
        this.perid = perid;
        this.pername = pername;
        this.pid = pid;
        this.perurl = perurl;
    }

    public Permission() {
        super();
    }

    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPerurl() {
        return perurl;
    }

    public void setPerurl(String perurl) {
        this.perurl = perurl;
    }
}