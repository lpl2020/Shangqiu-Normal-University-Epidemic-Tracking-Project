package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HostSummaryByStagesWithBLOBs;

public interface HostSummaryByStagesMapper {
    int insert(HostSummaryByStagesWithBLOBs record);

    int insertSelective(HostSummaryByStagesWithBLOBs record);
}