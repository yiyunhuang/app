package com.yiyun.application.dao;


import com.yiyun.application.pojo.po.Tab;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * User: DHC
 * Date: 2017/11/3
 * Time: 17:57
 * Version:V1.0
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml","classpath:spring/spring-solr-test.xml"})
public class TbUserMapperTest {

    @Autowired
    private TabMapper tabMapper;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Tab tab = tabMapper.selectByPrimaryKey(1L);
        System.out.println(tab);
    }



}

