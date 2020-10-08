package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XInnodbLockWaits;

public interface XInnodbLockWaitsMapper {
    int insert(XInnodbLockWaits record);

    int insertSelective(XInnodbLockWaits record);
}