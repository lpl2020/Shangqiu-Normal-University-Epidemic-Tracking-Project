package com.example.demo.sq.entity;

import java.util.Date;

public class PlanWork {
    private String planId;

    private String planTitle;

    private String planCreat;

    private String planTo;

    private Date planCreatime;

    private Date planUpdatetime;

    private String planFlag;

    private String planUpdate;

    private Integer planYxj;

    private Integer planFzd;

    private Date planStart;

    private Date planEnd;

    private String planContent;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId == null ? null : planId.trim();
    }

    public String getPlanTitle() {
        return planTitle;
    }

    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle == null ? null : planTitle.trim();
    }

    public String getPlanCreat() {
        return planCreat;
    }

    public void setPlanCreat(String planCreat) {
        this.planCreat = planCreat == null ? null : planCreat.trim();
    }

    public String getPlanTo() {
        return planTo;
    }

    public void setPlanTo(String planTo) {
        this.planTo = planTo == null ? null : planTo.trim();
    }

    public Date getPlanCreatime() {
        return planCreatime;
    }

    public void setPlanCreatime(Date planCreatime) {
        this.planCreatime = planCreatime;
    }

    public Date getPlanUpdatetime() {
        return planUpdatetime;
    }

    public void setPlanUpdatetime(Date planUpdatetime) {
        this.planUpdatetime = planUpdatetime;
    }

    public String getPlanFlag() {
        return planFlag;
    }

    public void setPlanFlag(String planFlag) {
        this.planFlag = planFlag == null ? null : planFlag.trim();
    }

    public String getPlanUpdate() {
        return planUpdate;
    }

    public void setPlanUpdate(String planUpdate) {
        this.planUpdate = planUpdate == null ? null : planUpdate.trim();
    }

    public Integer getPlanYxj() {
        return planYxj;
    }

    public void setPlanYxj(Integer planYxj) {
        this.planYxj = planYxj;
    }

    public Integer getPlanFzd() {
        return planFzd;
    }

    public void setPlanFzd(Integer planFzd) {
        this.planFzd = planFzd;
    }

    public Date getPlanStart() {
        return planStart;
    }

    public void setPlanStart(Date planStart) {
        this.planStart = planStart;
    }

    public Date getPlanEnd() {
        return planEnd;
    }

    public void setPlanEnd(Date planEnd) {
        this.planEnd = planEnd;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent == null ? null : planContent.trim();
    }
}