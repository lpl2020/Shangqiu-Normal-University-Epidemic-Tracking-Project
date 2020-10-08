package com.example.demo.sq.entity;

public class Memorandum {
    private String memoId;

    private Byte memoXqzs;

    private Byte memoYlzs;

    private String memoTitle;

    private String memoYear;

    private String memoMonth;

    private String memoDay;

    private String username;

    private String memoContent;

    public String getMemoId() {
        return memoId;
    }

    public void setMemoId(String memoId) {
        this.memoId = memoId == null ? null : memoId.trim();
    }

    public Byte getMemoXqzs() {
        return memoXqzs;
    }

    public void setMemoXqzs(Byte memoXqzs) {
        this.memoXqzs = memoXqzs;
    }

    public Byte getMemoYlzs() {
        return memoYlzs;
    }

    public void setMemoYlzs(Byte memoYlzs) {
        this.memoYlzs = memoYlzs;
    }

    public String getMemoTitle() {
        return memoTitle;
    }

    public void setMemoTitle(String memoTitle) {
        this.memoTitle = memoTitle == null ? null : memoTitle.trim();
    }

    public String getMemoYear() {
        return memoYear;
    }

    public void setMemoYear(String memoYear) {
        this.memoYear = memoYear == null ? null : memoYear.trim();
    }

    public String getMemoMonth() {
        return memoMonth;
    }

    public void setMemoMonth(String memoMonth) {
        this.memoMonth = memoMonth == null ? null : memoMonth.trim();
    }

    public String getMemoDay() {
        return memoDay;
    }

    public void setMemoDay(String memoDay) {
        this.memoDay = memoDay == null ? null : memoDay.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMemoContent() {
        return memoContent;
    }

    public void setMemoContent(String memoContent) {
        this.memoContent = memoContent == null ? null : memoContent.trim();
    }
}