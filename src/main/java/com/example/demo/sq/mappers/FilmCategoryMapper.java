package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.FilmCategory;
import com.example.demo.sq.entity.FilmCategoryKey;

public interface FilmCategoryMapper {
    int deleteByPrimaryKey(FilmCategoryKey key);

    int insert(FilmCategory record);

    int insertSelective(FilmCategory record);

    FilmCategory selectByPrimaryKey(FilmCategoryKey key);

    int updateByPrimaryKeySelective(FilmCategory record);

    int updateByPrimaryKey(FilmCategory record);
}