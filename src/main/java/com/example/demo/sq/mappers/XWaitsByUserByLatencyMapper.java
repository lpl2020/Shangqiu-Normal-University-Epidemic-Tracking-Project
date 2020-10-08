package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XWaitsByUserByLatency;

public interface XWaitsByUserByLatencyMapper {
    int insert(XWaitsByUserByLatency record);

    int insertSelective(XWaitsByUserByLatency record);
}