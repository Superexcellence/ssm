package com.zking.ssmProject.model;

import java.util.Date;

public class Record {
    private String recid;

    private String recbt;

    private String rechy;

    private Date recsj;

    private Float recdf;

    private Integer recpm;

    public Record(String recid, String recbt, String rechy, Date recsj, Float recdf, Integer recpm) {
        this.recid = recid;
        this.recbt = recbt;
        this.rechy = rechy;
        this.recsj = recsj;
        this.recdf = recdf;
        this.recpm = recpm;
    }

    public Record() {
        super();
    }

    public String getRecid() {
        return recid;
    }

    public void setRecid(String recid) {
        this.recid = recid;
    }

    public String getRecbt() {
        return recbt;
    }

    public void setRecbt(String recbt) {
        this.recbt = recbt;
    }

    public String getRechy() {
        return rechy;
    }

    public void setRechy(String rechy) {
        this.rechy = rechy;
    }

    public Date getRecsj() {
        return recsj;
    }

    public void setRecsj(Date recsj) {
        this.recsj = recsj;
    }

    public Float getRecdf() {
        return recdf;
    }

    public void setRecdf(Float recdf) {
        this.recdf = recdf;
    }

    public Integer getRecpm() {
        return recpm;
    }

    public void setRecpm(Integer recpm) {
        this.recpm = recpm;
    }
}