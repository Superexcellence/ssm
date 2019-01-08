package com.zking.ssmProject.model;

import java.util.Date;

public class Reply {
    private Integer repid;

    private String repname;

    private String repdw;

    private Date repdate;

    private String rephfbt;

    private String repdworr;

    private Date repdates;

    public Reply(Integer repid, String repname, String repdw, Date repdate, String rephfbt, String repdworr, Date repdates) {
        this.repid = repid;
        this.repname = repname;
        this.repdw = repdw;
        this.repdate = repdate;
        this.rephfbt = rephfbt;
        this.repdworr = repdworr;
        this.repdates = repdates;
    }

    public Reply() {
        super();
    }

    public Integer getRepid() {
        return repid;
    }

    public void setRepid(Integer repid) {
        this.repid = repid;
    }

    public String getRepname() {
        return repname;
    }

    public void setRepname(String repname) {
        this.repname = repname;
    }

    public String getRepdw() {
        return repdw;
    }

    public void setRepdw(String repdw) {
        this.repdw = repdw;
    }

    public Date getRepdate() {
        return repdate;
    }

    public void setRepdate(Date repdate) {
        this.repdate = repdate;
    }

    public String getRephfbt() {
        return rephfbt;
    }

    public void setRephfbt(String rephfbt) {
        this.rephfbt = rephfbt;
    }

    public String getRepdworr() {
        return repdworr;
    }

    public void setRepdworr(String repdworr) {
        this.repdworr = repdworr;
    }

    public Date getRepdates() {
        return repdates;
    }

    public void setRepdates(Date repdates) {
        this.repdates = repdates;
    }
}