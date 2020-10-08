package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XSessionWithBLOBs;

public interface XSessionMapper {
    int insert(XSessionWithBLOBs record);

    int insertSelective(XSessionWithBLOBs record);
}