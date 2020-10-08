package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Actor;

public interface ActorMapper {
    int deleteByPrimaryKey(Short actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    Actor selectByPrimaryKey(Short actorId);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}