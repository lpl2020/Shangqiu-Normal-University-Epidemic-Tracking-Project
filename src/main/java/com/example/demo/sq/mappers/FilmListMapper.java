package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.FilmListWithBLOBs;

public interface FilmListMapper {
    int insert(FilmListWithBLOBs record);

    int insertSelective(FilmListWithBLOBs record);
}