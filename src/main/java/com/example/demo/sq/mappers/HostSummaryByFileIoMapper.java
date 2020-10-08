package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HostSummaryByFileIo;

public interface HostSummaryByFileIoMapper {
    int insert(HostSummaryByFileIo record);

    int insertSelective(HostSummaryByFileIo record);
}