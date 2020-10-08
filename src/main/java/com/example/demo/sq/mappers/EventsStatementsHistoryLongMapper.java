package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsHistoryLongWithBLOBs;

public interface EventsStatementsHistoryLongMapper {
    int insert(EventsStatementsHistoryLongWithBLOBs record);

    int insertSelective(EventsStatementsHistoryLongWithBLOBs record);
}