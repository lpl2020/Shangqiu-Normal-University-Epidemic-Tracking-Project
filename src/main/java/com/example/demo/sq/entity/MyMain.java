package com.example.demo.sq.entity;

import java.util.Date;

public class MyMain {
    private String mainId;

    private String mainTitle;

    private Date mainCreatime;

    private String mainCreatuser;

    private Integer mainCommend;

    private String mainContent;

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle == null ? null : mainTitle.trim();
    }

    public Date getMainCreatime() {
        return mainCreatime;
    }

    public void setMainCreatime(Date mainCreatime) {
        this.mainCreatime = mainCreatime;
    }

    public String getMainCreatuser() {
        return mainCreatuser;
    }

    public void setMainCreatuser(String mainCreatuser) {
        this.mainCreatuser = mainCreatuser == null ? null : mainCreatuser.trim();
    }

    public Integer getMainCommend() {
        return mainCommend;
    }

    public void setMainCommend(Integer mainCommend) {
        this.mainCommend = mainCommend;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent == null ? null : mainContent.trim();
    }
}