package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCollageConfigure;
import com.example.demo.sq.entity.YqWxgjCollection;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YqWxgjCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    void postYqSaomainfo(YqWxgjCollection record);

    int insertSelective(YqWxgjCollection record);

    List<YqWxgjCollection> postGetScanninglist(String school,String no);

    List<Map<String,Object>> getXyRyInfo(String school);

    List<Map<String,Object>> getXyYjInfo(String school);

    YqWxgjCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqWxgjCollection record);

    int updateByPrimaryKey(YqWxgjCollection record);
}