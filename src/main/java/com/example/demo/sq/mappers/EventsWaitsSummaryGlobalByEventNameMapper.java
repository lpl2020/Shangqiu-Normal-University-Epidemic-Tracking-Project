package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsSummaryGlobalByEventName;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    int insert(EventsWaitsSummaryGlobalByEventName record);

    int insertSelective(EventsWaitsSummaryGlobalByEventName record);
}