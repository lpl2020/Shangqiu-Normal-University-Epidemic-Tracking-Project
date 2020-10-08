package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HostCache;

public interface HostCacheMapper {
    int insert(HostCache record);

    int insertSelective(HostCache record);
}