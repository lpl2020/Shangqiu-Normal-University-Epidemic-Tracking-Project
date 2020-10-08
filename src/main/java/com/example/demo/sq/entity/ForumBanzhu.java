package com.example.demo.sq.entity;

import java.util.Date;

public class ForumBanzhu {
    private Integer banzhuId;

    private String mainType;

    private String username;

    private Date creatime;

    private String creatuser;

    public Integer getBanzhuId() {
        return banzhuId;
    }

    public void setBanzhuId(Integer banzhuId) {
        this.banzhuId = banzhuId;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType == null ? null : mainType.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public String getCreatuser() {
        return creatuser;
    }

    public void setCreatuser(String creatuser) {
        this.creatuser = creatuser == null ? null : creatuser.trim();
    }
}