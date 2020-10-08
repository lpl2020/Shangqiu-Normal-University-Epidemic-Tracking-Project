package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Version;

public interface VersionMapper {
    int insert(Version record);

    int insertSelective(Version record);
}