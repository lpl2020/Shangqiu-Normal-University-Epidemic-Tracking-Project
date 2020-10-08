package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Plugins;

public interface PluginsMapper {
    int insert(Plugins record);

    int insertSelective(Plugins record);
}