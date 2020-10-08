package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Event;
import com.example.demo.sq.entity.EventKey;
import com.example.demo.sq.entity.EventWithBLOBs;

public interface EventMapper {
    int deleteByPrimaryKey(EventKey key);

    int insert(EventWithBLOBs record);

    int insertSelective(EventWithBLOBs record);

    EventWithBLOBs selectByPrimaryKey(EventKey key);

    int updateByPrimaryKeySelective(EventWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventWithBLOBs record);

    int updateByPrimaryKey(Event record);
}