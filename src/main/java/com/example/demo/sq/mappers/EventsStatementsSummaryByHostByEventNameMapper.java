package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsSummaryByHostByEventName;

public interface EventsStatementsSummaryByHostByEventNameMapper {
    int insert(EventsStatementsSummaryByHostByEventName record);

    int insertSelective(EventsStatementsSummaryByHostByEventName record);
}