package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationApplierStatus;

public interface ReplicationApplierStatusMapper {
    int insert(ReplicationApplierStatus record);

    int insertSelective(ReplicationApplierStatus record);
}