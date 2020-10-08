package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsSummaryByInstance;

public interface EventsWaitsSummaryByInstanceMapper {
    int insert(EventsWaitsSummaryByInstance record);

    int insertSelective(EventsWaitsSummaryByInstance record);
}