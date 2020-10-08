package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SocketSummaryByInstance;

public interface SocketSummaryByInstanceMapper {
    int insert(SocketSummaryByInstance record);

    int insertSelective(SocketSummaryByInstance record);
}