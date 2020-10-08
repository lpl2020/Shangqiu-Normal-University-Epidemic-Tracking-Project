package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationApplierStatusByCoordinator;

public interface ReplicationApplierStatusByCoordinatorMapper {
    int insert(ReplicationApplierStatusByCoordinator record);

    int insertSelective(ReplicationApplierStatusByCoordinator record);
}