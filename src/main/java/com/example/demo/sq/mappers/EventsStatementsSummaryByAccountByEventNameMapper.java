package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsSummaryByAccountByEventName;

public interface EventsStatementsSummaryByAccountByEventNameMapper {
    int insert(EventsStatementsSummaryByAccountByEventName record);

    int insertSelective(EventsStatementsSummaryByAccountByEventName record);
}