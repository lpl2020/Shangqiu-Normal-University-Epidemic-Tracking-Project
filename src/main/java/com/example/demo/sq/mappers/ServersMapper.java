package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Servers;

public interface ServersMapper {
    int deleteByPrimaryKey(String serverName);

    int insert(Servers record);

    int insertSelective(Servers record);

    Servers selectByPrimaryKey(String serverName);

    int updateByPrimaryKeySelective(Servers record);

    int updateByPrimaryKey(Servers record);
}