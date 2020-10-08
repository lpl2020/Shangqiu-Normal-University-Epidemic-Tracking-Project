package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.PartitionsWithBLOBs;

public interface PartitionsMapper {
    int insert(PartitionsWithBLOBs record);

    int insertSelective(PartitionsWithBLOBs record);
}