package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ForumBanzhu;

public interface ForumBanzhuMapper {
    int deleteByPrimaryKey(Integer banzhuId);

    int insert(ForumBanzhu record);

    int insertSelective(ForumBanzhu record);

    ForumBanzhu selectByPrimaryKey(Integer banzhuId);

    int updateByPrimaryKeySelective(ForumBanzhu record);

    int updateByPrimaryKey(ForumBanzhu record);
}