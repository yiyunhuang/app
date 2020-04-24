package com.yiyun.application.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName TreeAction
 * @Description TODO  tree action
 * @program: application
 * @date 2020/4/23 22:31
 **/

@Controller
@Scope("prototype")
public class TreeAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/treeAction")
    public String  index(){

        logger.info("TreeAction.index");

        return "branchTree";
    }

}
