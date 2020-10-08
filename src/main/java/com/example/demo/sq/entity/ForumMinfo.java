package com.example.demo.sq.entity;

import java.util.Date;

public class ForumMinfo {
    private Integer minfoId;

    private String mainType;

    private Integer minfoReply;

    private String minfoBanzhu;

    private Date minfoCreatime;

    private String minfoCreatuser;

    private Integer minfoOrder;

    private Integer minfoSee;

    private String minfoPhoto;

    private String minfoTitle;

    private Integer minfoCount;

    public Integer getMinfoId() {
        return minfoId;
    }

    public void setMinfoId(Integer minfoId) {
        this.minfoId = minfoId;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType == null ? null : mainType.trim();
    }

    public Integer getMinfoReply() {
        return minfoReply;
    }

    public void setMinfoReply(Integer minfoReply) {
        this.minfoReply = minfoReply;
    }

    public String getMinfoBanzhu() {
        return minfoBanzhu;
    }

    public void setMinfoBanzhu(String minfoBanzhu) {
        this.minfoBanzhu = minfoBanzhu == null ? null : minfoBanzhu.trim();
    }

    public Date getMinfoCreatime() {
        return minfoCreatime;
    }

    public void setMinfoCreatime(Date minfoCreatime) {
        this.minfoCreatime = minfoCreatime;
    }

    public String getMinfoCreatuser() {
        return minfoCreatuser;
    }

    public void setMinfoCreatuser(String minfoCreatuser) {
        this.minfoCreatuser = minfoCreatuser == null ? null : minfoCreatuser.trim();
    }

    public Integer getMinfoOrder() {
        return minfoOrder;
    }

    public void setMinfoOrder(Integer minfoOrder) {
        this.minfoOrder = minfoOrder;
    }

    public Integer getMinfoSee() {
        return minfoSee;
    }

    public void setMinfoSee(Integer minfoSee) {
        this.minfoSee = minfoSee;
    }

    public String getMinfoPhoto() {
        return minfoPhoto;
    }

    public void setMinfoPhoto(String minfoPhoto) {
        this.minfoPhoto = minfoPhoto == null ? null : minfoPhoto.trim();
    }

    public String getMinfoTitle() {
        return minfoTitle;
    }

    public void setMinfoTitle(String minfoTitle) {
        this.minfoTitle = minfoTitle == null ? null : minfoTitle.trim();
    }

    public Integer getMinfoCount() {
        return minfoCount;
    }

    public void setMinfoCount(Integer minfoCount) {
        this.minfoCount = minfoCount;
    }
}