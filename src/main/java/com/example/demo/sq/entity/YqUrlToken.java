package com.example.demo.sq.entity;

public class YqUrlToken {
    private Integer id;

    private String school;

    private String bigscreenUrl;

    private String wxUrl;

    private String token;

    private String databaseType;

    private String schoolJc;

    private String user;

    private String password;

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

    public String getBigscreenUrl() {
        return bigscreenUrl;
    }

    public void setBigscreenUrl(String bigscreenUrl) {
        this.bigscreenUrl = bigscreenUrl == null ? null : bigscreenUrl.trim();
    }

    public String getWxUrl() {
        return wxUrl;
    }

    public void setWxUrl(String wxUrl) {
        this.wxUrl = wxUrl == null ? null : wxUrl.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType == null ? null : databaseType.trim();
    }

    public String getSchoolJc() {
        return schoolJc;
    }

    public void setSchoolJc(String schoolJc) {
        this.schoolJc = schoolJc == null ? null : schoolJc.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}