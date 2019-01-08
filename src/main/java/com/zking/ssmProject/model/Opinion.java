package com.zking.ssmProject.model;

import java.util.Date;

public class Opinion {
    private Integer opid;

    private String oplgbt;

    private String opdl;

    private String opxl;

    private String oplgrordw;

    private String optel;

    private String opbsrsf;

    private Date opbssj;

    private String opbsr;

    private String opqfld;

    private Integer opsfgk;

    private String opjtnr;

    private String fileid;

    private Integer proid;

    public Opinion(Integer opid, String oplgbt, String opdl, String opxl, String oplgrordw, String optel, String opbsrsf, Date opbssj, String opbsr, String opqfld, Integer opsfgk, String opjtnr, String fileid, Integer proid) {
        this.opid = opid;
        this.oplgbt = oplgbt;
        this.opdl = opdl;
        this.opxl = opxl;
        this.oplgrordw = oplgrordw;
        this.optel = optel;
        this.opbsrsf = opbsrsf;
        this.opbssj = opbssj;
        this.opbsr = opbsr;
        this.opqfld = opqfld;
        this.opsfgk = opsfgk;
        this.opjtnr = opjtnr;
        this.fileid = fileid;
        this.proid = proid;
    }

    public Opinion() {
        super();
    }

    public Integer getOpid() {
        return opid;
    }

    public void setOpid(Integer opid) {
        this.opid = opid;
    }

    public String getOplgbt() {
        return oplgbt;
    }

    public void setOplgbt(String oplgbt) {
        this.oplgbt = oplgbt;
    }

    public String getOpdl() {
        return opdl;
    }

    public void setOpdl(String opdl) {
        this.opdl = opdl;
    }

    public String getOpxl() {
        return opxl;
    }

    public void setOpxl(String opxl) {
        this.opxl = opxl;
    }

    public String getOplgrordw() {
        return oplgrordw;
    }

    public void setOplgrordw(String oplgrordw) {
        this.oplgrordw = oplgrordw;
    }

    public String getOptel() {
        return optel;
    }

    public void setOptel(String optel) {
        this.optel = optel;
    }

    public String getOpbsrsf() {
        return opbsrsf;
    }

    public void setOpbsrsf(String opbsrsf) {
        this.opbsrsf = opbsrsf;
    }

    public Date getOpbssj() {
        return opbssj;
    }

    public void setOpbssj(Date opbssj) {
        this.opbssj = opbssj;
    }

    public String getOpbsr() {
        return opbsr;
    }

    public void setOpbsr(String opbsr) {
        this.opbsr = opbsr;
    }

    public String getOpqfld() {
        return opqfld;
    }

    public void setOpqfld(String opqfld) {
        this.opqfld = opqfld;
    }

    public Integer getOpsfgk() {
        return opsfgk;
    }

    public void setOpsfgk(Integer opsfgk) {
        this.opsfgk = opsfgk;
    }

    public String getOpjtnr() {
        return opjtnr;
    }

    public void setOpjtnr(String opjtnr) {
        this.opjtnr = opjtnr;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }
}