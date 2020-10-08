package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.IoGlobalByWaitByBytesWithBLOBs;

public interface IoGlobalByWaitByBytesMapper {
    int insert(IoGlobalByWaitByBytesWithBLOBs record);

    int insertSelective(IoGlobalByWaitByBytesWithBLOBs record);
}