package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationConnectionStatus;

public interface ReplicationConnectionStatusMapper {
    int insert(ReplicationConnectionStatus record);

    int insertSelective(ReplicationConnectionStatus record);
}