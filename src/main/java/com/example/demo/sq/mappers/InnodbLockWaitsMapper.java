package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbLockWaitsWithBLOBs;

public interface InnodbLockWaitsMapper {
    int insert(InnodbLockWaitsWithBLOBs record);

    int insertSelective(InnodbLockWaitsWithBLOBs record);
}