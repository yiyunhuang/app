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
    public Result<GlobalDictionary> listDictionaryByPage(Page page);

    /**
     * 新增
     * @param gd 实体类
     * @return 受到影响的行数
     */
    public Long saveDictionary(GlobalDictionary gd);

}
