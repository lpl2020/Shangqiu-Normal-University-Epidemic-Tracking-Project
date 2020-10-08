package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MetadataLocks;

public interface MetadataLocksMapper {
    int insert(MetadataLocks record);

    int insertSelective(MetadataLocks record);
}