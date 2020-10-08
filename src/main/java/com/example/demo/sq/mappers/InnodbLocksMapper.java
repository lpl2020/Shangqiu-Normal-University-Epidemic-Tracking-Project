package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbLocks;

public interface InnodbLocksMapper {
    int insert(InnodbLocks record);

    int insertSelective(InnodbLocks record);
}