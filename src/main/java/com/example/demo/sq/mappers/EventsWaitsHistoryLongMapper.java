package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsHistoryLong;

public interface EventsWaitsHistoryLongMapper {
    int insert(EventsWaitsHistoryLong record);

    int insertSelective(EventsWaitsHistoryLong record);
}