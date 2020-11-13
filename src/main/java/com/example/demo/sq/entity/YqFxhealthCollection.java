package com.example.demo.sq.entity;

import java.util.Date;

public class YqFxhealthCollection {
    private Integer id;

    private String school;

    private String userName;

    private String userNo;

    private String timestamp;

    private String heathinfo1;

    private Integer heathinfo2;

    private Integer heathinfo3;

    private String isQuarantine;

    private String notes;

    private String temperature;

    private Date createTime;

    private Integer ZdgcNum;

    public Integer getZdgcNum() {
        return ZdgcNum;
    }

    public void setZdgcNum(Integer zdgcNum) {
        ZdgcNum = zdgcNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHeathinfo1() {
        return heathinfo1;
    }

    public void setHeathinfo1(String heathinfo1) {
        this.heathinfo1 = heathinfo1 == null ? null : heathinfo1.trim();
    }

    public Integer getHeathinfo2() {
        return heathinfo2;
    }

    public void setHeathinfo2(Integer heathinfo2) {
        this.heathinfo2 = heathinfo2;
    }

    public Integer getHeathinfo3() {
        return heathinfo3;
    }

    public void setHeathinfo3(Integer heathinfo3) {
        this.heathinfo3 = heathinfo3;
    }

    public String getIsQuarantine() {
        return isQuarantine;
    }

    public void setIsQuarantine(String isQuarantine) {
        this.isQuarantine = isQuarantine;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}