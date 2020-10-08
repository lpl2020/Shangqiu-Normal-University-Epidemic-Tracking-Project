package com.example.demo.sq.entity;

public class CdcOptLog {
    private Integer id;

    private String 学号;

    private Integer 操作;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get学号() {
        return 学号;
    }

    public void set学号(String 学号) {
        this.学号 = 学号 == null ? null : 学号.trim();
    }

    public Integer get操作() {
        return 操作;
    }

    public void set操作(Integer 操作) {
        this.操作 = 操作;
    }
}