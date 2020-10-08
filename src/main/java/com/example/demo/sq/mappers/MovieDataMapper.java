package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MovieData;

public interface MovieDataMapper {
    int deleteByPrimaryKey(String name);

    int insert(MovieData record);

    int insertSelective(MovieData record);

    MovieData selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(MovieData record);

    int updateByPrimaryKey(MovieData record);
}