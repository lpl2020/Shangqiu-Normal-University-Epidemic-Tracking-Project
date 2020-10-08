package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.FilmActor;
import com.example.demo.sq.entity.FilmActorKey;

public interface FilmActorMapper {
    int deleteByPrimaryKey(FilmActorKey key);

    int insert(FilmActor record);

    int insertSelective(FilmActor record);

    FilmActor selectByPrimaryKey(FilmActorKey key);

    int updateByPrimaryKeySelective(FilmActor record);

    int updateByPrimaryKey(FilmActor record);
}