package com.yiyun.application.service.impl;

import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.dao.GlobalDictionaryCustomMapper;
import com.yiyun.application.dao.GlobalDictionaryMapper;
import com.yiyun.application.pojo.po.GlobalDictionary;
import com.yiyun.application.service.DictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName DictionaryServiceImpl
 * @Description TODO  字典接口实现类
 * @program: application
 * @date 2020/4/27 0027 11:01
 **/
public class DictionaryServiceImpl implements DictionaryService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GlobalDictionaryMapper DictionaryDao;
    @Autowired
    private GlobalDictionaryCustomMapper DictionaryCustomDao;


    @Override
    public Result<GlobalDictionary> listDictionaryByPage(Page page) {
        GlobalDictionary gd = new GlobalDictionary();
        Result<GlobalDictionary> result = null;
        try {
            //0 创建一个Map封装前台传递过来的参数
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("page", page);
            //1 创建一个响应参数实体类
            result = new Result<GlobalDictionary>();
            //2 对total进行设值(符合条件的总记录数)
            int total = DictionaryCustomDao.countDictionaries(map);
            result.setTotal(total);
            //3 对rows进行设值(指定页码显示记录集合)
            List<GlobalDictionary> list = DictionaryCustomDao.lisDictionariesByPage(map);
            result.setRows(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

}
