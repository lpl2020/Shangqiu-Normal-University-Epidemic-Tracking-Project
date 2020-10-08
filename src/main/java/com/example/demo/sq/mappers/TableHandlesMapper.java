package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TableHandles;

public interface TableHandlesMapper {
    int insert(TableHandles record);

    int insertSelective(TableHandles record);
}