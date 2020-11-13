package com.example.demo.sq.entity;

import java.util.Date;

public class YqFxdataCollection {
    private Integer id;

    private String school;

    private String username;

    private String userno;

    private String fxtime;

    private String fxcountry;

    private String fxprovince;

    private String fxcity;

    private String fxtown;

    private String fxvehicle;

    private Integer throughepidemicarea;

    private String trainnum;

    private Date createtime;

    private Integer fxNum;

    private Integer jwfxNum;

    private Integer wsfxNum;

    private String fxjk;

    private String fxjtSm;

    public String getFxjk() {
        return fxjk;
    }

    public void setFxjk(String fxjk) {
        this.fxjk = fxjk;
    }

    public String getFxjtSm() {
        return fxjtSm;
    }

    public void setFxjtSm(String fxjtSm) {
        this.fxjtSm = fxjtSm;
    }

    public Integer getFxNum() {
        return fxNum;
    }

    public void setFxNum(Integer fxNum) {
        this.fxNum = fxNum;
    }

    public Integer getJwfxNum() {
        return jwfxNum;
    }

    public void setJwfxNum(Integer jwfxNum) {
        this.jwfxNum = jwfxNum;
    }

    public Integer getWsfxNum() {
        return wsfxNum;
    }

    public void setWsfxNum(Integer wsfxNum) {
        this.wsfxNum = wsfxNum;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getFxtime() {
        return fxtime;
    }

    public void setFxtime(String fxtime) {
        this.fxtime = fxtime;
    }

    public String getFxcountry() {
        return fxcountry;
    }

    public void setFxcountry(String fxcountry) {
        this.fxcountry = fxcountry == null ? null : fxcountry.trim();
    }

    public String getFxprovince() {
        return fxprovince;
    }

    public void setFxprovince(String fxprovince) {
        this.fxprovince = fxprovince == null ? null : fxprovince.trim();
    }

    public String getFxcity() {
        return fxcity;
    }

    public void setFxcity(String fxcity) {
        this.fxcity = fxcity == null ? null : fxcity.trim();
    }

    public String getFxtown() {
        return fxtown;
    }

    public void setFxtown(String fxtown) {
        this.fxtown = fxtown == null ? null : fxtown.trim();
    }

    public String getFxvehicle() {
        return fxvehicle;
    }

    public void setFxvehicle(String fxvehicle) {
        this.fxvehicle = fxvehicle == null ? null : fxvehicle.trim();
    }

    public Integer getThroughepidemicarea() {
        return throughepidemicarea;
    }

    public void setThroughepidemicarea(Integer throughepidemicarea) {
        this.throughepidemicarea = throughepidemicarea;
    }

    public String getTrainnum() {
        return trainnum;
    }

    public void setTrainnum(String trainnum) {
        this.trainnum = trainnum == null ? null : trainnum.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}