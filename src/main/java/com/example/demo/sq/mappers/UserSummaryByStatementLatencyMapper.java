package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserSummaryByStatementLatencyWithBLOBs;

public interface UserSummaryByStatementLatencyMapper {
    int insert(UserSummaryByStatementLatencyWithBLOBs record);

    int insertSelective(UserSummaryByStatementLatencyWithBLOBs record);
}