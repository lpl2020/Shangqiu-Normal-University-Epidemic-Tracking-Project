package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbTableStats;
import com.example.demo.sq.entity.InnodbTableStatsKey;

public interface InnodbTableStatsMapper {
    int deleteByPrimaryKey(InnodbTableStatsKey key);

    int insert(InnodbTableStats record);

    int insertSelective(InnodbTableStats record);

    InnodbTableStats selectByPrimaryKey(InnodbTableStatsKey key);

    int updateByPrimaryKeySelective(InnodbTableStats record);

    int updateByPrimaryKey(InnodbTableStats record);
}