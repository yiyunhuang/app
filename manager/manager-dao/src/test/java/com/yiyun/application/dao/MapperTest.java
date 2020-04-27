package com.yiyun.application.dao;


import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.pojo.po.GlobalDictionary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * User: DHC
 * Date: 2017/11/3
 * Time: 17:57
 * Version:V1.0
 *//*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})*/
public class MapperTest {
/*

    @Autowired
    private GlobalDictionaryCustomMapper DictionaryCustomDao;
    @Autowired
    private GlobalDictionaryMapper DictionaryDao;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Result<GlobalDictionary> result = null;
        try {
            //0 创建一个Map封装前台传递过来的参数
            Map<String, Object> map = new HashMap<String, Object>();
            Page page=new Page();
            page.setPage(1);
            page.setRows(3);
            map.put("page", page);
            //1 创建一个响应参数实体类
            result = new Result<GlobalDictionary>();
            //2 对total进行设值(符合条件的总记录数)
            int total = DictionaryCustomDao.countDictionaries(map);
            result.setTotal(total);
            //3 对rows进行设值(指定页码显示记录集合)
            List<GlobalDictionary> list = DictionaryCustomDao.lisDictionariesByPage(map);
            System.out.println(list);
            result.setRows(list);

            GlobalDictionary globalDictionary = DictionaryDao.selectByPrimaryKey(2L);
            System.out.println(globalDictionary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/



}

