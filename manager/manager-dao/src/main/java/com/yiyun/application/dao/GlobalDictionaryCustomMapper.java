package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.GlobalDictionary;

import java.util.List;
import java.util.Map;

/*
 * @Author 翼云
 * @Description // 自定义的字典实体类数据访问层接口
 * @Date  2020/4/27 0027 11:15
 * @Param
 * @return
**/
public interface GlobalDictionaryCustomMapper {

    /**
     * 查询字典表中所有记录的数量
     * @return
     */
    int countDictionaries(Map<String,Object> map);

    /**
     * 查询指定页码显示记录集合
     * @param map
     * @return
     */
    List<GlobalDictionary> lisDictionariesByPage(Map<String,Object> map);

}