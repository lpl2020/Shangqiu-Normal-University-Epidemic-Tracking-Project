package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ForumMinfo;

public interface ForumMinfoMapper {
    int deleteByPrimaryKey(Integer minfoId);

    int insert(ForumMinfo record);

    int insertSelective(ForumMinfo record);

    ForumMinfo selectByPrimaryKey(Integer minfoId);

    int updateByPrimaryKeySelective(ForumMinfo record);

    int updateByPrimaryKey(ForumMinfo record);
}