package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStagesSummaryByAccountByEventName;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    int insert(EventsStagesSummaryByAccountByEventName record);

    int insertSelective(EventsStagesSummaryByAccountByEventName record);
}