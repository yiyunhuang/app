package com.yiyun.application.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName DictionaryAction
 * @Description TODO
 * @program: application
 * @date 2020/4/23 22:33
 **/

public class DictionaryAction {

    @RequestMapping("/dictionaryAction")
    public String  index(){
        return "dictionary";
    }

}
