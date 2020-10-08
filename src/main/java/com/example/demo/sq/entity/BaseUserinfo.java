package com.example.demo.sq.entity;

public class BaseUserinfo {
    private String baseId;

    private String baseName;

    private String baseSex;

    private Integer baseAge;

    private Integer baseFatieshu;

    private Integer baseHuitieshu;

    private String basePhoto;

    private String baseShenfenzheng;

    private String username;

    public String getBaseId() {
        return baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId == null ? null : baseId.trim();
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName == null ? null : baseName.trim();
    }

    public String getBaseSex() {
        return baseSex;
    }

    public void setBaseSex(String baseSex) {
        this.baseSex = baseSex == null ? null : baseSex.trim();
    }

    public Integer getBaseAge() {
        return baseAge;
    }

    public void setBaseAge(Integer baseAge) {
        this.baseAge = baseAge;
    }

    public Integer getBaseFatieshu() {
        return baseFatieshu;
    }

    public void setBaseFatieshu(Integer baseFatieshu) {
        this.baseFatieshu = baseFatieshu;
    }

    public Integer getBaseHuitieshu() {
        return baseHuitieshu;
    }

    public void setBaseHuitieshu(Integer baseHuitieshu) {
        this.baseHuitieshu = baseHuitieshu;
    }

    public String getBasePhoto() {
        return basePhoto;
    }

    public void setBasePhoto(String basePhoto) {
        this.basePhoto = basePhoto == null ? null : basePhoto.trim();
    }

    public String getBaseShenfenzheng() {
        return baseShenfenzheng;
    }

    public void setBaseShenfenzheng(String baseShenfenzheng) {
        this.baseShenfenzheng = baseShenfenzheng == null ? null : baseShenfenzheng.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}