package com.zking.ssmProject.model;

public class Vote {
    private Integer voteid;

    private Integer userid;

    private Integer proid;

    public Vote(Integer voteid, Integer userid, Integer proid) {
        this.voteid = voteid;
        this.userid = userid;
        this.proid = proid;
    }

    public Vote() {
        super();
    }

    public Integer getVoteid() {
        return voteid;
    }

    public void setVoteid(Integer voteid) {
        this.voteid = voteid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }
}