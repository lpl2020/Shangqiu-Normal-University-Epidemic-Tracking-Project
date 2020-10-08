package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HostSummaryByFileIoTypeWithBLOBs;

public interface HostSummaryByFileIoTypeMapper {
    int insert(HostSummaryByFileIoTypeWithBLOBs record);

    int insertSelective(HostSummaryByFileIoTypeWithBLOBs record);
}