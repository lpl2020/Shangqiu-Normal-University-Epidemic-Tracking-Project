package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XWaitsByHostByLatency;

public interface XWaitsByHostByLatencyMapper {
    int insert(XWaitsByHostByLatency record);

    int insertSelective(XWaitsByHostByLatency record);
}