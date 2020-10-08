package com.example.demo.sq.entity;

import java.util.Date;

public class MySecond {
    private String secId;

    private String mainId;

    private Date secCreatime;

    private String secCreatuser;

    private Integer secSequence;

    private String secContent;

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId == null ? null : secId.trim();
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    public Date getSecCreatime() {
        return secCreatime;
    }

    public void setSecCreatime(Date secCreatime) {
        this.secCreatime = secCreatime;
    }

    public String getSecCreatuser() {
        return secCreatuser;
    }

    public void setSecCreatuser(String secCreatuser) {
        this.secCreatuser = secCreatuser == null ? null : secCreatuser.trim();
    }

    public Integer getSecSequence() {
        return secSequence;
    }

    public void setSecSequence(Integer secSequence) {
        this.secSequence = secSequence;
    }

    public String getSecContent() {
        return secContent;
    }

    public void setSecContent(String secContent) {
        this.secContent = secContent == null ? null : secContent.trim();
    }
}