package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationApplierStatusByWorker;

public interface ReplicationApplierStatusByWorkerMapper {
    int insert(ReplicationApplierStatusByWorker record);

    int insertSelective(ReplicationApplierStatusByWorker record);
}