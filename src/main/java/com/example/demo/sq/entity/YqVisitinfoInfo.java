package com.example.demo.sq.entity;

public class YqVisitinfoInfo {
    private Integer id;

    private String school;

    private String name;

    private String phone;

    private String toname;

    private String tophone;

    private String visitinfo;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getToname() {
        return toname;
    }

    public void setToname(String toname) {
        this.toname = toname == null ? null : toname.trim();
    }

    public String getTophone() {
        return tophone;
    }

    public void setTophone(String tophone) {
        this.tophone = tophone == null ? null : tophone.trim();
    }

    public String getVisitinfo() {
        return visitinfo;
    }

    public void setVisitinfo(String visitinfo) {
        this.visitinfo = visitinfo == null ? null : visitinfo.trim();
    }
}