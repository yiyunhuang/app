package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.GlobalDictionary;
import com.yiyun.application.pojo.po.GlobalDictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GlobalDictionaryMapper {
    int countByExample(GlobalDictionaryExample example);

    int deleteByExample(GlobalDictionaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(GlobalDictionary record);

    int insertSelective(GlobalDictionary record);

    List<GlobalDictionary> selectByExample(GlobalDictionaryExample example);

    GlobalDictionary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GlobalDictionary record, @Param("example") GlobalDictionaryExample example);

    int updateByExample(@Param("record") GlobalDictionary record, @Param("example") GlobalDictionaryExample example);

    int updateByPrimaryKeySelective(GlobalDictionary record);

    int updateByPrimaryKey(GlobalDictionary record);
}