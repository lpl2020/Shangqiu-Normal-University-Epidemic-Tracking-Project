package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HostSummaryWithBLOBs;

public interface HostSummaryMapper {
    int insert(HostSummaryWithBLOBs record);

    int insertSelective(HostSummaryWithBLOBs record);
}