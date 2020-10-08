package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStagesSummaryByHostByEventName;

public interface EventsStagesSummaryByHostByEventNameMapper {
    int insert(EventsStagesSummaryByHostByEventName record);

    int insertSelective(EventsStagesSummaryByHostByEventName record);
}