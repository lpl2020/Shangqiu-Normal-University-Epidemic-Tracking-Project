package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqStudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YqStudentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqStudentInfo record);

    int insertSelective(YqStudentInfo record);

    List<Map<String,Object>> getStudentInfo();

    YqStudentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqStudentInfo record);

    int updateByPrimaryKey(YqStudentInfo record);
}