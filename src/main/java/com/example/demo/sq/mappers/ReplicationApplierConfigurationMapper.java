package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationApplierConfiguration;

public interface ReplicationApplierConfigurationMapper {
    int insert(ReplicationApplierConfiguration record);

    int insertSelective(ReplicationApplierConfiguration record);
}