package com.yiyun.application.web;

import com.yiyun.application.common.dto.MessageResult;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        return "dictionary/dictionary";
    }
    @RequestMapping("/dictionaryEditor")
    public String  dictionaryEditor(){
        logger.info("DictionaryAction.dictionaryEditor");
        return "dictionary/dictionaryEditor";
    }


    @ResponseBody
    @RequestMapping("/dictionaries")
    public Result<GlobalDictionary> listDictionariesByPage(Page page, Query query) {
        logger.info("DictionaryAction.listDictionariesByPage");
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
/*
 * @Author 翼云
 * @Description // add dictionary
 * @Date  2020/5/6 0006 16:04
 * @Param [id, page, query]
 * @return com.yiyun.application.common.dto.MessageResult
**/
    @ResponseBody
    @RequestMapping(value="/dictionary", method= RequestMethod.PUT)
    public MessageResult dictionariesEditor(GlobalDictionary gd) {
        logger.info("DictionaryAction.dictionariesEditor");
        MessageResult mr = new MessageResult();
        Result<GlobalDictionary> list = null;
        try {
            final Long dicLong = DictionaryService.saveDictionary(gd);
            mr.setSuccess(true);
            mr.setMessage("添加"+dicLong+"个字典成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            mr.setSuccess(false);
            list.setCode("1");
            e.printStackTrace();
        }
        list.setCode("0");
        return mr;
    }


}
