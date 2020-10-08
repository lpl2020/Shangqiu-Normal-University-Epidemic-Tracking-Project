package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.LatestFileIoWithBLOBs;

public interface LatestFileIoMapper {
    int insert(LatestFileIoWithBLOBs record);

    int insertSelective(LatestFileIoWithBLOBs record);
}