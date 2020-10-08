package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbFtBeingDeleted;

public interface InnodbFtBeingDeletedMapper {
    int insert(InnodbFtBeingDeleted record);

    int insertSelective(InnodbFtBeingDeleted record);
}