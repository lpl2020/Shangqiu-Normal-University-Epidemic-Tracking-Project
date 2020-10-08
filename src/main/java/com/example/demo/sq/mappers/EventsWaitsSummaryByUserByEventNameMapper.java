package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsSummaryByUserByEventName;

public interface EventsWaitsSummaryByUserByEventNameMapper {
    int insert(EventsWaitsSummaryByUserByEventName record);

    int insertSelective(EventsWaitsSummaryByUserByEventName record);
}