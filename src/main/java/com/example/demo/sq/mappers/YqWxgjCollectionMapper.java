package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCollageConfigure;
import com.example.demo.sq.entity.YqWxgjCollection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YqWxgjCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    void postYqSaomainfo(YqWxgjCollection record);

    int insertSelective(YqWxgjCollection record);

    List<YqWxgjCollection> postGetScanninglist(String school,String no);

    YqWxgjCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqWxgjCollection record);

    int updateByPrimaryKey(YqWxgjCollection record);
}