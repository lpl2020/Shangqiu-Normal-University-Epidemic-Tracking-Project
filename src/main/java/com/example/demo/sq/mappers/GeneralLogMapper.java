package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.GeneralLogWithBLOBs;

public interface GeneralLogMapper {
    int insert(GeneralLogWithBLOBs record);

    int insertSelective(GeneralLogWithBLOBs record);
}