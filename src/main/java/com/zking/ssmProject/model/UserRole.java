package com.zking.ssmProject.model;

public class UserRole {
    private Integer userid;

    private String roleid;

    public UserRole(Integer userid, String roleid) {
        this.userid = userid;
        this.roleid = roleid;
    }

    public UserRole() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}