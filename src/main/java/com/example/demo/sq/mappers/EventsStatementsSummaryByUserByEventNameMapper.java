package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsSummaryByUserByEventName;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    int insert(EventsStatementsSummaryByUserByEventName record);

    int insertSelective(EventsStatementsSummaryByUserByEventName record);
}