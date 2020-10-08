package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XProcesslistWithBLOBs;

public interface XProcesslistMapper {
    int insert(XProcesslistWithBLOBs record);

    int insertSelective(XProcesslistWithBLOBs record);
}