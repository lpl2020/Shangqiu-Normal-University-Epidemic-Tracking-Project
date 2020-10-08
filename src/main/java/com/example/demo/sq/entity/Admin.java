package com.example.demo.sq.entity;

public class Admin {
    private Integer adminid;

    private String adminname;

    private String adminpwd;

    private Short admintype;

    private String lastlogintime;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public Short getAdmintype() {
        return admintype;
    }

    public void setAdmintype(Short admintype) {
        this.admintype = admintype;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
    }
}