package com.example.demo.sq.entity;

import java.util.Date;

public class FilmCategory extends FilmCategoryKey {
    private Date lastUpdate;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}