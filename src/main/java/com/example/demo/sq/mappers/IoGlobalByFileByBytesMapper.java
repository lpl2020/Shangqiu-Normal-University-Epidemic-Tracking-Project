package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.IoGlobalByFileByBytesWithBLOBs;

public interface IoGlobalByFileByBytesMapper {
    int insert(IoGlobalByFileByBytesWithBLOBs record);

    int insertSelective(IoGlobalByFileByBytesWithBLOBs record);
}