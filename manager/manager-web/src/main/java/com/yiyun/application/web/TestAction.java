package com.yiyun.application.web;

import com.yiyun.application.service.impl.TestServiceImpl;
import com.yiyun.application.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName TestAction
 * @Description   测试请求
 * @program: application
 * @date 2020/1/13 0013 11:03
 **/
@Controller
@Scope("prototype")
public class TestAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping("/test")
    public void test(){
        logger.info("TestAction/test");
        HashMap map = new HashMap();
        map.put("test","select");
        testService.test(map);
    }


}
