package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HelpRelationKey;

public interface HelpRelationMapper {
    int deleteByPrimaryKey(HelpRelationKey key);

    int insert(HelpRelationKey record);

    int insertSelective(HelpRelationKey record);
}