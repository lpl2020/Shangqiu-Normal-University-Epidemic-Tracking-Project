package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SocketSummaryByEventName;

public interface SocketSummaryByEventNameMapper {
    int insert(SocketSummaryByEventName record);

    int insertSelective(SocketSummaryByEventName record);
}