package com.zking.ssmProject.model;

public class Join {
    private String joinid;

    private String joinname;

    public Join(String joinid, String joinname) {
        this.joinid = joinid;
        this.joinname = joinname;
    }

    public Join() {
        super();
    }

    public String getJoinid() {
        return joinid;
    }

    public void setJoinid(String joinid) {
        this.joinid = joinid;
    }

    public String getJoinname() {
        return joinname;
    }

    public void setJoinname(String joinname) {
        this.joinname = joinname;
    }
}