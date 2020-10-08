package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SlowLogWithBLOBs;

public interface SlowLogMapper {
    int insert(SlowLogWithBLOBs record);

    int insertSelective(SlowLogWithBLOBs record);
}