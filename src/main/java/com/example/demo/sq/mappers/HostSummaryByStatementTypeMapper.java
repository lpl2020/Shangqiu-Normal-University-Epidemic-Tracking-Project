package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HostSummaryByStatementTypeWithBLOBs;

public interface HostSummaryByStatementTypeMapper {
    int insert(HostSummaryByStatementTypeWithBLOBs record);

    int insertSelective(HostSummaryByStatementTypeWithBLOBs record);
}