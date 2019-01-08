package com.zking.ssmProject.model;

import java.util.Date;

public class Sing {
    private Integer singid;

    private Integer userid;

    private Date singrcsj;

    private Date singccsj;

    private String singkqqk;

    public Sing(Integer singid, Integer userid, Date singrcsj, Date singccsj, String singkqqk) {
        this.singid = singid;
        this.userid = userid;
        this.singrcsj = singrcsj;
        this.singccsj = singccsj;
        this.singkqqk = singkqqk;
    }

    public Sing() {
        super();
    }

    public Integer getSingid() {
        return singid;
    }

    public void setSingid(Integer singid) {
        this.singid = singid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getSingrcsj() {
        return singrcsj;
    }

    public void setSingrcsj(Date singrcsj) {
        this.singrcsj = singrcsj;
    }

    public Date getSingccsj() {
        return singccsj;
    }

    public void setSingccsj(Date singccsj) {
        this.singccsj = singccsj;
    }

    public String getSingkqqk() {
        return singkqqk;
    }

    public void setSingkqqk(String singkqqk) {
        this.singkqqk = singkqqk;
    }
}