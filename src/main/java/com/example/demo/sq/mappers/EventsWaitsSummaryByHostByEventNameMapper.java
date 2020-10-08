package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsSummaryByHostByEventName;

public interface EventsWaitsSummaryByHostByEventNameMapper {
    int insert(EventsWaitsSummaryByHostByEventName record);

    int insertSelective(EventsWaitsSummaryByHostByEventName record);
}