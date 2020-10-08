package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsSummaryByThreadByEventName;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    int insert(EventsWaitsSummaryByThreadByEventName record);

    int insertSelective(EventsWaitsSummaryByThreadByEventName record);
}