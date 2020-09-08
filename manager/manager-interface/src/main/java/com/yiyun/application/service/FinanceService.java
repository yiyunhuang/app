package com.yiyun.application.service;


import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.pojo.po.GlobalDictionary;

/**
 * @Author 翼云
 * @Description // 记账服务类
 * @Date  2020/4/27
 * @Param
 * @return
 **/
public interface FinanceService {


    /**
     * 依据条件查找 对应数据
     * @param page
     * @param record
     * @return
     */
    Result<GlobalDictionary> listFinanceServiceByPage(Page page, FinanceService record);


}
