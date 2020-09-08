package com.yiyun.application.service.impl;

import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.common.util.yiyun;
import com.yiyun.application.dao.GlobalDictionaryCustomMapper;
import com.yiyun.application.dao.GlobalDictionaryMapper;
import com.yiyun.application.pojo.po.GlobalDictionary;
import com.yiyun.application.service.DictionaryService;
import com.yiyun.application.service.FinanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName DictionaryServiceImpl
 * @Description  记账功能实现类
 * @program: application
 * @date 2020/4/27 0027 11:01
 **/
@Service
public class FinanceServiceImpl implements FinanceService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GlobalDictionaryMapper DictionaryDao;
    @Autowired
    private GlobalDictionaryCustomMapper DictionaryCustomDao;


    @Override
    public Result<GlobalDictionary> listDictionaryByPage(Page page, GlobalDictionary record) {
        logger.info("DictionaryServiceImpl.listDictionaryByPage");
        GlobalDictionary gd = new GlobalDictionary();
        Result<GlobalDictionary> result = null;
        try {
            //0 创建一个Map封装前台传递过来的参数
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("page", page);
            map.put("record", record);
            //1 创建一个响应参数实体类
            result = new Result<GlobalDictionary>();
            //2 对total进行设值(符合条件的总记录数)
            int count = DictionaryCustomDao.countDictionaries(map);
            result.setCount(count);
            //3 对 data 进行设值(指定页码显示记录集合)
            List<GlobalDictionary> list = DictionaryCustomDao.lisDictionariesByPage(map);
            result.setData(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Long saveDictionary(GlobalDictionary gd) {
        return null;
    }

    @Transactional
    @Override
    public Long updateDictionary(String id, GlobalDictionary gd) {
        Integer update = DictionaryDao.updateByPrimaryKeySelective(gd);
        return Long.valueOf(update);
    }


    @Transactional
    @Override
    public Long deleteDictionary(String id) {
        Integer delete = DictionaryDao.deleteByPrimaryKey(id);
        return Long.valueOf(delete);
    }

    @Override
    public GlobalDictionary queryDictionary(String id) {
        GlobalDictionary globalDictionary = DictionaryDao.selectByPrimaryKey(id);
        return globalDictionary;
    }


}
