package com.zking.ssmProject.model;

public class Role {
    private String roleid;

    private String rolename;

    private String roleremark;

    public Role(String roleid, String rolename, String roleremark) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.roleremark = roleremark;
    }

    public Role() {
        super();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoleremark() {
        return roleremark;
    }

    public void setRoleremark(String roleremark) {
        this.roleremark = roleremark;
    }
}