package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemoryByHostByCurrentBytesWithBLOBs;

public interface MemoryByHostByCurrentBytesMapper {
    int insert(MemoryByHostByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByHostByCurrentBytesWithBLOBs record);
}