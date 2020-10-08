package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReferentialConstraints;

public interface ReferentialConstraintsMapper {
    int insert(ReferentialConstraints record);

    int insertSelective(ReferentialConstraints record);
}