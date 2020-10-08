package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TriggersWithBLOBs;

public interface TriggersMapper {
    int insert(TriggersWithBLOBs record);

    int insertSelective(TriggersWithBLOBs record);
}