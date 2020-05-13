package com.yiyun.application.service;


import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.pojo.po.GlobalDictionary;

/**
 * @Author 翼云
 * @Description // 字典服务类
 * @Date  2020/4/27
 * @Param
 * @return
 **/
public interface DictionaryService {

    /**
     * 分页获得字典表的所有数据
     * @param page
     * @return
     */
    Result<GlobalDictionary> listDictionaryByPage(Page page, GlobalDictionary record);

    /**
     * 新增
     * @param gd 实体类
     * @return 受到影响的行数
     */
    Long saveDictionary(GlobalDictionary gd);

    /**
     * @Author yiyun
     * @Description // update dictionary
     * @Date  2020/5/9 0009 14:22
     * @Param [id, gd]
     * @return java.lang.Long
    **/
    Long updateDictionary(String id ,GlobalDictionary gd);

    /**
     * @Author yiyun
     * @Description //delete dictionary
     * @Date  2020/5/9 0009 14:51
     * @Param [id]
     * @return java.lang.Long
    **/
    Long deleteDictionary(String id);

    /**
     * @Author yiyun
     * @Description // Retrieve dictionary
     * @Date  2020/5/13 0013 15:27
     * @Param [id]
     * @return java.lang.Long
    **/
    GlobalDictionary queryDictionary(String id);


}
