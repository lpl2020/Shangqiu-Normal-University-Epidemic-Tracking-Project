package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStagesHistory;

public interface EventsStagesHistoryMapper {
    int insert(EventsStagesHistory record);

    int insertSelective(EventsStagesHistory record);
}