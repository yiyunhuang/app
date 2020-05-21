package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.GlobalDictionary;

import java.util.List;
import java.util.Map;

public interface ApplicationAccountCustomMapper {

/**
 * @Author yiyun
 * @Description // count UserAccount
 * @Date  2020/5/21 0021 16:18
 * @Param [map]
 * @return int
**/
    int countUserAccount(Map<String,Object> map);

    /**
     * 查询指定页码显示记录集合
     * @param map
     * @return
     */
    List<GlobalDictionary> getUserAccountByPage(Map<String,Object> map);

}