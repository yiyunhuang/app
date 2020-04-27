package com.yiyun.application.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName DictionaryAction
 * @Description
 * @program: application
 * @date 2020/4/23 22:33
 **/

@Controller
@Scope("prototype")
public class DictionaryAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/dictionaryAction")
    public String  index(){
        logger.info("DictionaryAction.index");

        return "dictionary";
    }

}
