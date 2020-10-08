package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsHistory;

public interface EventsWaitsHistoryMapper {
    int insert(EventsWaitsHistory record);

    int insertSelective(EventsWaitsHistory record);
}