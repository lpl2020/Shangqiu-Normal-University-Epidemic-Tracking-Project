package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XMemoryGlobalByCurrentBytes;

public interface XMemoryGlobalByCurrentBytesMapper {
    int insert(XMemoryGlobalByCurrentBytes record);

    int insertSelective(XMemoryGlobalByCurrentBytes record);
}