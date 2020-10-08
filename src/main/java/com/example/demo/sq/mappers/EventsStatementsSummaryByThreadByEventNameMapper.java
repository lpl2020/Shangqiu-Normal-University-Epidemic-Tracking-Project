package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsSummaryByThreadByEventName;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    int insert(EventsStatementsSummaryByThreadByEventName record);

    int insertSelective(EventsStatementsSummaryByThreadByEventName record);
}