package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCollageConfigure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YqCollageConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqCollageConfigure record);

    int insertSelective(YqCollageConfigure record);

    List<YqCollageConfigure> postGetschoollist();

    List<YqCollageConfigure> postGetcollagelist(String schools);

    List<YqCollageConfigure> postpersonallitylist(String schools, String collages);

    YqCollageConfigure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqCollageConfigure record);

    int updateByPrimaryKey(YqCollageConfigure record);
}