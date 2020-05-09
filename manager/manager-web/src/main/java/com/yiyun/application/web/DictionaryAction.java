package com.yiyun.application.web;

import com.alibaba.fastjson.JSON;
import com.yiyun.application.common.dto.MessageResult;
import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Query;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.pojo.po.GlobalDictionary;
import com.yiyun.application.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * get dictionaries list
     * @param page
     * @param query
     * @return com.yiyun.application.common.dto.MessageResult
     */
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
/**
 * @Author yiyun
 * @Description //TODO query dictionary
 * @Date  2020/5/9 0009 11:26
 * @Param [id]
 * @return com.yiyun.application.common.dto.MessageResult
**/
    @ResponseBody
    @RequestMapping(value="/dictionaries/{id}", method= RequestMethod.GET)
    public MessageResult getDictionary(@PathVariable Long  id) {
        logger.info("DictionaryAction.getDictionary");
        MessageResult mr = new MessageResult();
        try {
            System.out.println(id);
//            final Long dicLong = DictionaryService.saveDictionary(globalDictionary);
            mr.setSuccess(true);
            mr.setMessage("查询成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            mr.setSuccess(false);
            mr.setMessage("查询失败");
            e.printStackTrace();
        }
        return mr;
    }

/**
 * @Author 翼云
 * @Description // add dictionary
 * @Date  2020/5/6 0006 16:04
 * @Param [gd, code, mess]
 * @return com.yiyun.application.common.dto.MessageResult
**/
    @ResponseBody
    @RequestMapping(value="/dictionaries", method= RequestMethod.POST)
    public MessageResult postDictionary(String gd) {
        logger.info("DictionaryAction.postDictionary");
        MessageResult mr = new MessageResult();
        GlobalDictionary globalDictionary = new GlobalDictionary();
        List< GlobalDictionary > gdList = new ArrayList< GlobalDictionary >();
        if (StringUtils.isNotBlank(gd)) {
            gdList = JSON.parseArray(gd, GlobalDictionary.class);
        }
        if(gdList.size()>0){
            globalDictionary=gdList.get(0);
        }
        Result<GlobalDictionary> list = null;
        try {
            final Long dicLong = DictionaryService.saveDictionary(globalDictionary);
            mr.setSuccess(true);
            mr.setMessage("添加"+dicLong+"个字典成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            mr.setSuccess(false);
            e.printStackTrace();
        }
        return mr;
    }
/**
 * @Author yiyun
 * @Description //TODO delete dictionary
 * @Date  2020/5/9 0009 11:12
 * @Param [id]
 * @return com.yiyun.application.common.dto.MessageResult
**/
    @ResponseBody
    @RequestMapping(value="/dictionaries/{id}", method= RequestMethod.DELETE)
    public MessageResult deleteDictionary(@PathVariable Long  id) {
        logger.info("DictionaryAction.deleteDictionary");
        MessageResult mr = new MessageResult();
        try {
//            final Long dicLong = DictionaryService.saveDictionary(globalDictionary);
            System.out.println(id);
            mr.setSuccess(true);
            mr.setMessage("删除成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            mr.setSuccess(false);
            mr.setMessage("删除失败");
            e.printStackTrace();
        }
        return mr;
    }

    /**
     * @Author yiyun
     * @Description //TODO update dictionary
     * @Date  2020/5/9 0009 11:23
     * @Param [id]
     * @return com.yiyun.application.common.dto.MessageResult
    **/
    @ResponseBody
    @RequestMapping(value="/dictionaries/{id}", method= RequestMethod.PUT)
    public MessageResult putDictionary(@PathVariable Long  id) {
        logger.info("DictionaryAction.putDictionary");
        MessageResult mr = new MessageResult();
        try {
            System.out.println(id);
//            final Long dicLong = DictionaryService.saveDictionary(globalDictionary);
            mr.setSuccess(true);
            mr.setMessage("更新成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            mr.setSuccess(false);
            mr.setMessage("更新失败");
            e.printStackTrace();
        }
        return mr;
    }



}
