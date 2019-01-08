package com.zking.ssmProject.model;

import java.util.Date;

public class Advice {
    private String advid;

    private String advbt;

    private String advqk;

    private Date advsj;

    private String advhf;

    private String advzr;

    public Advice(String advid, String advbt, String advqk, Date advsj, String advhf, String advzr) {
        this.advid = advid;
        this.advbt = advbt;
        this.advqk = advqk;
        this.advsj = advsj;
        this.advhf = advhf;
        this.advzr = advzr;
    }

    public Advice() {
        super();
    }

    public String getAdvid() {
        return advid;
    }

    public void setAdvid(String advid) {
        this.advid = advid;
    }

    public String getAdvbt() {
        return advbt;
    }

    public void setAdvbt(String advbt) {
        this.advbt = advbt;
    }

    public String getAdvqk() {
        return advqk;
    }

    public void setAdvqk(String advqk) {
        this.advqk = advqk;
    }

    public Date getAdvsj() {
        return advsj;
    }

    public void setAdvsj(Date advsj) {
        this.advsj = advsj;
    }

    public String getAdvhf() {
        return advhf;
    }

    public void setAdvhf(String advhf) {
        this.advhf = advhf;
    }

    public String getAdvzr() {
        return advzr;
    }

    public void setAdvzr(String advzr) {
        this.advzr = advzr;
    }
}