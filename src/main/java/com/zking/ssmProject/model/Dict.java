package com.zking.ssmProject.model;

public class Dict {
    private String dicid;

    private String dicname;

    private String dictype;

    private String dicvalue;

    public Dict(String dicid, String dicname, String dictype, String dicvalue) {
        this.dicid = dicid;
        this.dicname = dicname;
        this.dictype = dictype;
        this.dicvalue = dicvalue;
    }

    public Dict() {
        super();
    }

    public String getDicid() {
        return dicid;
    }

    public void setDicid(String dicid) {
        this.dicid = dicid;
    }

    public String getDicname() {
        return dicname;
    }

    public void setDicname(String dicname) {
        this.dicname = dicname;
    }

    public String getDictype() {
        return dictype;
    }

    public void setDictype(String dictype) {
        this.dictype = dictype;
    }

    public String getDicvalue() {
        return dicvalue;
    }

    public void setDicvalue(String dicvalue) {
        this.dicvalue = dicvalue;
    }
}