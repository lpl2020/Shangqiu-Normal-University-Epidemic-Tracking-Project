package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqWxgjCollection;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface YqWxgjCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqWxgjCollection record);

    int insertSelective(YqWxgjCollection record);

    YqWxgjCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqWxgjCollection record);

    int updateByPrimaryKey(YqWxgjCollection record);

    List<Map<String, Object>> getXmcrCountDataInfo();
    List<Map<String, Object>> getSygrgitDataInfo();
    List<Map<String, Object>> getSygrxysjDataInfo();
}