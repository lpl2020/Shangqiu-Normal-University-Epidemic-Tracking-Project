package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysForeign;

public interface InnodbSysForeignMapper {
    int insert(InnodbSysForeign record);

    int insertSelective(InnodbSysForeign record);
}