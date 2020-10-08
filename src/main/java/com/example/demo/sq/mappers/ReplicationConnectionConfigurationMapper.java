package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationConnectionConfiguration;

public interface ReplicationConnectionConfigurationMapper {
    int insert(ReplicationConnectionConfiguration record);

    int insertSelective(ReplicationConnectionConfiguration record);
}