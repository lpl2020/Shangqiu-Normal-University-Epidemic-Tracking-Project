package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Plugin;

public interface PluginMapper {
    int deleteByPrimaryKey(String name);

    int insert(Plugin record);

    int insertSelective(Plugin record);

    Plugin selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Plugin record);

    int updateByPrimaryKey(Plugin record);
}