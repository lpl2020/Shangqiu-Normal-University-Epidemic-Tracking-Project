package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemoryByUserByCurrentBytesWithBLOBs;

public interface MemoryByUserByCurrentBytesMapper {
    int insert(MemoryByUserByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByUserByCurrentBytesWithBLOBs record);
}