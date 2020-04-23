package com.yiyun.application.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName TreeAction
 * @Description TODO  tree action
 * @program: application
 * @date 2020/4/23 22:31
 **/

public class TreeAction {

    @RequestMapping("/treeAction")
    public String  index(){
        return "branchTree";
    }

}
