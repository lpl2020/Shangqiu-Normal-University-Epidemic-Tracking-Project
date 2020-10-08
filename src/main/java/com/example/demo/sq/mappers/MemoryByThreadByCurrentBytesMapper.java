package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemoryByThreadByCurrentBytesWithBLOBs;

public interface MemoryByThreadByCurrentBytesMapper {
    int insert(MemoryByThreadByCurrentBytesWithBLOBs record);

    int insertSelective(MemoryByThreadByCurrentBytesWithBLOBs record);
}