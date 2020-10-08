package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TableConstraints;

public interface TableConstraintsMapper {
    int insert(TableConstraints record);

    int insertSelective(TableConstraints record);
}