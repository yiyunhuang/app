package com.yiyun.application.web;

import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Query;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.pojo.po.GlobalDictionary;
import com.yiyun.application.service.DictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DictionaryService DictionaryService;

    @RequestMapping("/dictionaryAction")
    public String  index(){
        logger.info("DictionaryAction.index");
        return "dictionary";
    }

    @ResponseBody
    @RequestMapping("/dictionaries")
    public Result<GlobalDictionary> listItemsByPage(Page page, Query query) {
        logger.info("DictionaryAction.listItemsByPage");
        Result<GlobalDictionary> list = null;
        try {
            list = DictionaryService.listDictionaryByPage(page);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            list.setCode("1");
            e.printStackTrace();
        }
        list.setCode("0");
        return list;
    }

}
