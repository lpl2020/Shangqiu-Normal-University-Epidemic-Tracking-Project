package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbIndexStats;
import com.example.demo.sq.entity.InnodbIndexStatsKey;

public interface InnodbIndexStatsMapper {
    int deleteByPrimaryKey(InnodbIndexStatsKey key);

    int insert(InnodbIndexStats record);

    int insertSelective(InnodbIndexStats record);

    InnodbIndexStats selectByPrimaryKey(InnodbIndexStatsKey key);

    int updateByPrimaryKeySelective(InnodbIndexStats record);

    int updateByPrimaryKey(InnodbIndexStats record);
}