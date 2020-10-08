package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsWaitsCurrent;

public interface EventsWaitsCurrentMapper {
    int insert(EventsWaitsCurrent record);

    int insertSelective(EventsWaitsCurrent record);
}