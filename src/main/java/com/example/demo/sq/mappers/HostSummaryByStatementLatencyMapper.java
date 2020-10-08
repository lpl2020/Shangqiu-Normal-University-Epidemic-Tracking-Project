package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HostSummaryByStatementLatencyWithBLOBs;

public interface HostSummaryByStatementLatencyMapper {
    int insert(HostSummaryByStatementLatencyWithBLOBs record);

    int insertSelective(HostSummaryByStatementLatencyWithBLOBs record);
}