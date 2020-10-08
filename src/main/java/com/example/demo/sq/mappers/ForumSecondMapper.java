package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ForumSecond;

public interface ForumSecondMapper {
    int deleteByPrimaryKey(String secId);

    int insert(ForumSecond record);

    int insertSelective(ForumSecond record);

    ForumSecond selectByPrimaryKey(String secId);

    int updateByPrimaryKeySelective(ForumSecond record);

    int updateByPrimaryKeyWithBLOBs(ForumSecond record);

    int updateByPrimaryKey(ForumSecond record);
}