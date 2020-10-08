package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ForumInfo;

public interface ForumInfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(ForumInfo record);

    int insertSelective(ForumInfo record);

    ForumInfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(ForumInfo record);

    int updateByPrimaryKey(ForumInfo record);
}