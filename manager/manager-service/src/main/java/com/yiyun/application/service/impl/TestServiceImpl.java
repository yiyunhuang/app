package com.yiyun.application.service.impl;

import com.yiyun.application.dao.LogMapper;
import com.yiyun.application.dao.TabMapper;
import com.yiyun.application.pojo.po.Tab;
import com.yiyun.application.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName testServiceImpl
 * @Description  测试接口实现
 * @program: application
 * @date 2020/1/13 0013 11:08
 **/
public class TestServiceImpl implements TestService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LogMapper logMapper;
    @Autowired
    private TabMapper tabMapper;

    @Override
    public HashMap test(HashMap map ) {
        logger.info("TestServiceImpl/test");
        String test = (String) map.get("test");
        if ("insert".equals(test)){
            Tab tab = new Tab();
            tab.setId(1L);
            tab.setType("test");
            tab.setDatajson("123");
            tab.setDate(new Date());
            tab.setSign(1);
            tabMapper.insert(tab);
            Tab tab1 = new Tab();
            tab1.setId(2L);
            tab1.setType("test");
            tab1.setDatajson("123");
            tab1.setDate(new Date());
            tab1.setSign(1);
            tabMapper.insert(tab1);
        }else if ("delete".equals(test)){
            tabMapper.deleteByPrimaryKey(1L);
        }else if ("select".equals(test)){
            Tab tab = tabMapper.selectByPrimaryKey(1L);
            logger.info(String.valueOf(tab.getId()+tab.getDatajson()));
        }else if ("update".equals(test)){
            Tab tab = new Tab();
            tab.setId(1L);
            tab.setType("test");
            tab.setDatajson("123");
            tab.setDate(new Date());
            tab.setSign(1);
            tabMapper.updateByPrimaryKey(tab);
        }
        return null;
    }


}
