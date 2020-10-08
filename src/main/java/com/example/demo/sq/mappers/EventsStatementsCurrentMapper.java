package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsCurrentWithBLOBs;

public interface EventsStatementsCurrentMapper {
    int insert(EventsStatementsCurrentWithBLOBs record);

    int insertSelective(EventsStatementsCurrentWithBLOBs record);
}