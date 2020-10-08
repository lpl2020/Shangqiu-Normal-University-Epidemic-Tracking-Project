package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.NicerButSlowerFilmListWithBLOBs;

public interface NicerButSlowerFilmListMapper {
    int insert(NicerButSlowerFilmListWithBLOBs record);

    int insertSelective(NicerButSlowerFilmListWithBLOBs record);
}