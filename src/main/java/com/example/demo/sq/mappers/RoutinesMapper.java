package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.RoutinesWithBLOBs;

public interface RoutinesMapper {
    int insert(RoutinesWithBLOBs record);

    int insertSelective(RoutinesWithBLOBs record);
}