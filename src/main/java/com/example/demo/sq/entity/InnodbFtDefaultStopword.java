package com.example.demo.sq.entity;

public class InnodbFtDefaultStopword {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}