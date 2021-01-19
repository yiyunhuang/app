package com.yiyun.application.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName IndexAction
 * @Description  主页跳转类
 * @program: application
 * @date 2020/4/22 21:31
 **/


@Controller
@Scope("prototype")
public class LoginAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/")
    public String  index(){
        logger.info("LoginAction.index");
        return "login1";
    }

}
