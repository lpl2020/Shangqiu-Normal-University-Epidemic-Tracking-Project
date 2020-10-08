package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XMemoryByHostByCurrentBytes;

public interface XMemoryByHostByCurrentBytesMapper {
    int insert(XMemoryByHostByCurrentBytes record);

    int insertSelective(XMemoryByHostByCurrentBytes record);
}