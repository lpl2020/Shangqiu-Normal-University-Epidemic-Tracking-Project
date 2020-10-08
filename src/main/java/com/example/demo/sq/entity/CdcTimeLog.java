package com.example.demo.sq.entity;

import java.util.Date;

public class CdcTimeLog {
    private Integer id;

    private Date lasttimeoperate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLasttimeoperate() {
        return lasttimeoperate;
    }

    public void setLasttimeoperate(Date lasttimeoperate) {
        this.lasttimeoperate = lasttimeoperate;
    }
}