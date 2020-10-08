package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysTablespaces;

public interface InnodbSysTablespacesMapper {
    int insert(InnodbSysTablespaces record);

    int insertSelective(InnodbSysTablespaces record);
}