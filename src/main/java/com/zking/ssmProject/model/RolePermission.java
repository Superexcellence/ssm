package com.zking.ssmProject.model;

public class RolePermission {
    private String roleid;

    private String perid;

    public RolePermission(String roleid, String perid) {
        this.roleid = roleid;
        this.perid = perid;
    }

    public RolePermission() {
        super();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid;
    }
}