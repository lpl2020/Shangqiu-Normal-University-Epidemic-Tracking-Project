package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ActorInfo;

public interface ActorInfoMapper {
    int insert(ActorInfo record);

    int insertSelective(ActorInfo record);
}