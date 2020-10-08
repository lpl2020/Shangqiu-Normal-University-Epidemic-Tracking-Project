package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.FileInstances;

public interface FileInstancesMapper {
    int insert(FileInstances record);

    int insertSelective(FileInstances record);
}