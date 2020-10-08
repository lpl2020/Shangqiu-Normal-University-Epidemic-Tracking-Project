package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysDatafiles;

public interface InnodbSysDatafilesMapper {
    int insert(InnodbSysDatafiles record);

    int insertSelective(InnodbSysDatafiles record);
}