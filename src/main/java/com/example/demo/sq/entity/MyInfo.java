package com.example.demo.sq.entity;

import java.util.Date;

public class MyInfo {
    private Integer infoId;

    private String mainId;

    private Integer infoReply;

    private Integer infoSee;

    private String infoLastuser;

    private Date infoLastime;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    public Integer getInfoReply() {
        return infoReply;
    }

    public void setInfoReply(Integer infoReply) {
        this.infoReply = infoReply;
    }

    public Integer getInfoSee() {
        return infoSee;
    }

    public void setInfoSee(Integer infoSee) {
        this.infoSee = infoSee;
    }

    public String getInfoLastuser() {
        return infoLastuser;
    }

    public void setInfoLastuser(String infoLastuser) {
        this.infoLastuser = infoLastuser == null ? null : infoLastuser.trim();
    }

    public Date getInfoLastime() {
        return infoLastime;
    }

    public void setInfoLastime(Date infoLastime) {
        this.infoLastime = infoLastime;
    }
}