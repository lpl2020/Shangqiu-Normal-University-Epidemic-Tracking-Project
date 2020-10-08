package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsSummaryByAccountByEventName;

public interface EventsWaitsSummaryByAccountByEventNameMapper {
    int insert(EventsWaitsSummaryByAccountByEventName record);

    int insertSelective(EventsWaitsSummaryByAccountByEventName record);
}