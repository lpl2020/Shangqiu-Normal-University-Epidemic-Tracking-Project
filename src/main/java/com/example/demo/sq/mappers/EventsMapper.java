package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Events;

public interface EventsMapper {
    int insert(Events record);

    int insertSelective(Events record);
}