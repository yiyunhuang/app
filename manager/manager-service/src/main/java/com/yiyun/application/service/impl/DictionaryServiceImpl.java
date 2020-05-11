package com.yiyun.application.service.impl;

import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.common.util.yiyun;
import com.yiyun.application.dao.GlobalDictionaryCustomMapper;
import com.yiyun.application.dao.GlobalDictionaryMapper;
import com.yiyun.application.pojo.po.GlobalDictionary;
import com.yiyun.application.service.DictionaryService;
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
 * @Description TODO  字典接口实现类
 * @program: application
 * @date 2020/4/27 0027 11:01
 **/
@Service
public class DictionaryServiceImpl implements DictionaryService{
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

    //加上注解@Transactional之后，这个方法就变成了事务方法
    //并不是事务方法越多越好，查询方法不需要添加为事务方法
    @Transactional
    @Override
    public Long saveDictionary(GlobalDictionary gd) throws IllegalArgumentException{
        gd.setId(yiyun.getId(1L,1L));
        gd.setIsSign((byte) 1);
        Integer insert = DictionaryDao.insert(gd);
        return Long.valueOf(insert);
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
        Integer update = DictionaryDao.deleteByPrimaryKey(id);
        return Long.valueOf(update);
    }



}
