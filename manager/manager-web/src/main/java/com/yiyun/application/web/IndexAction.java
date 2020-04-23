package com.yiyun.application.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class IndexAction {


    @RequestMapping("/")
    public String  index(){
        return "index";
    }

}
