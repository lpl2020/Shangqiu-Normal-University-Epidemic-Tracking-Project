package com.example.demo.sq.entity;

import java.util.Date;

public class SdycStudentStaistic {
    private Integer id;

    private String submission;

    private Date subtime;

    private String studentno;

    private String studentname;

    private String phonenumber;

    private String universitycode;

    private String college;

    private String specialities;

    private String emergecontact;

    private String emergenum;

    private String city14;

    private String wuhan;

    private String temperature;

    private String healthy;

    private String medicaladvice;

    private String feverpatients;

    private String iscontact;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission == null ? null : submission.trim();
    }

    public Date getSubtime() {
        return subtime;
    }

    public void setSubtime(Date subtime) {
        this.subtime = subtime;
    }

    public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno == null ? null : studentno.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getUniversitycode() {
        return universitycode;
    }

    public void setUniversitycode(String universitycode) {
        this.universitycode = universitycode == null ? null : universitycode.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getSpecialities() {
        return specialities;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities == null ? null : specialities.trim();
    }

    public String getEmergecontact() {
        return emergecontact;
    }

    public void setEmergecontact(String emergecontact) {
        this.emergecontact = emergecontact == null ? null : emergecontact.trim();
    }

    public String getEmergenum() {
        return emergenum;
    }

    public void setEmergenum(String emergenum) {
        this.emergenum = emergenum == null ? null : emergenum.trim();
    }

    public String getCity14() {
        return city14;
    }

    public void setCity14(String city14) {
        this.city14 = city14 == null ? null : city14.trim();
    }

    public String getWuhan() {
        return wuhan;
    }

    public void setWuhan(String wuhan) {
        this.wuhan = wuhan == null ? null : wuhan.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getHealthy() {
        return healthy;
    }

    public void setHealthy(String healthy) {
        this.healthy = healthy == null ? null : healthy.trim();
    }

    public String getMedicaladvice() {
        return medicaladvice;
    }

    public void setMedicaladvice(String medicaladvice) {
        this.medicaladvice = medicaladvice == null ? null : medicaladvice.trim();
    }

    public String getFeverpatients() {
        return feverpatients;
    }

    public void setFeverpatients(String feverpatients) {
        this.feverpatients = feverpatients == null ? null : feverpatients.trim();
    }

    public String getIscontact() {
        return iscontact;
    }

    public void setIscontact(String iscontact) {
        this.iscontact = iscontact == null ? null : iscontact.trim();
    }
}