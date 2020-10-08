package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsHistoryWithBLOBs;

public interface EventsStatementsHistoryMapper {
    int insert(EventsStatementsHistoryWithBLOBs record);

    int insertSelective(EventsStatementsHistoryWithBLOBs record);
}