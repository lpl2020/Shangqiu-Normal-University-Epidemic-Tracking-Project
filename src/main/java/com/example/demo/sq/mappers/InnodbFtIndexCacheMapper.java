package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbFtIndexCache;

public interface InnodbFtIndexCacheMapper {
    int insert(InnodbFtIndexCache record);

    int insertSelective(InnodbFtIndexCache record);
}