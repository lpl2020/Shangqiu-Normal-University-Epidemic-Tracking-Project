package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemoryGlobalByCurrentBytesWithBLOBs;

public interface MemoryGlobalByCurrentBytesMapper {
    int insert(MemoryGlobalByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryGlobalByCurrentBytesWithBLOBs record);
}