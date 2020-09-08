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
     * @param page 分页页码
     * @param record 条件
     * @return 结果集
     */
    Result<GlobalDictionary> listDictionaryByPage(Page page, GlobalDictionary record);

    /**
     * 新增
     * @param gd 实体类
     * @return 受到影响的行数
     */
    Long saveDictionary(GlobalDictionary gd);


    /**
     *  update Dictionary
     * @param id
     * @param gd
     * @return
     */
    Long updateDictionary(String id ,GlobalDictionary gd);


    /**
     * delete dictionary
     * @param id
     * @return 结果
     */
    Long deleteDictionary(String id);

    /**
     *  依据id查找结果
     * @param id  id
     * @return 结果
     */
    GlobalDictionary queryDictionary(String id);


}
