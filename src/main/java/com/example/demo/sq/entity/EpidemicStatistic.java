package com.example.demo.sq.entity;

import java.util.Date;

public class EpidemicStatistic {
    private Integer id;

    private Integer epiddeter;

    private Integer epidsuspd;

    private Integer epidnow;

    private Date datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEpiddeter() {
        return epiddeter;
    }

    public void setEpiddeter(Integer epiddeter) {
        this.epiddeter = epiddeter;
    }

    public Integer getEpidsuspd() {
        return epidsuspd;
    }

    public void setEpidsuspd(Integer epidsuspd) {
        this.epidsuspd = epidsuspd;
    }

    public Integer getEpidnow() {
        return epidnow;
    }

    public void setEpidnow(Integer epidnow) {
        this.epidnow = epidnow;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}