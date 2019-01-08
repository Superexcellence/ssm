package com.zking.ssmProject.model;

import java.util.Date;

public class Apply {
    private Integer appid;

    private Integer userid;

    private String meeid;

    private Date appdate;

    public Apply(Integer appid, Integer userid, String meeid, Date appdate) {
        this.appid = appid;
        this.userid = userid;
        this.meeid = meeid;
        this.appdate = appdate;
    }

    public Apply() {
        super();
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMeeid() {
        return meeid;
    }

    public void setMeeid(String meeid) {
        this.meeid = meeid;
    }

    public Date getAppdate() {
        return appdate;
    }

    public void setAppdate(Date appdate) {
        this.appdate = appdate;
    }
}