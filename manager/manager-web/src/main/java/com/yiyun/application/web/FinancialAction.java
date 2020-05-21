package com.yiyun.application.web;

import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.common.util.JsonUtils;
import com.yiyun.application.pojo.po.ApplicationAccount;
import com.yiyun.application.pojo.po.GlobalDictionary;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName FinancialAction
 * @Description TODO 记账功能开发
 * @program: application
 * @date 2020/4/23 22:32
 **/
@Controller
@Scope("prototype")
public class FinancialAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/financialAction")
    public String  index(){
        logger.info("FinancialAction.index");
        return "financial/financial.jsp";
    }

    @ResponseBody
    @RequestMapping(value="/financial", method= RequestMethod.GET)
    public Result<GlobalDictionary> getFinancialByPage(Page page, String aa) {
        logger.info("FinancialAction.getFinancialByPage");
        Result<GlobalDictionary> list = null;
        try {
            ApplicationAccount ApplicationAccount = new ApplicationAccount();
            List< ApplicationAccount > gdList = new ArrayList< ApplicationAccount >();
            if (StringUtils.isNotBlank(aa)) {
                gdList = JsonUtils.jsonToList(aa, ApplicationAccount.class);
            }
            if(gdList.size()>0){
                ApplicationAccount=gdList.get(0);
            }
//            list = dictionaryService.listDictionaryByPage(page,userAccount);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            list.setCode("1");
            e.printStackTrace();
        }
        list.setCode("0");
        return list;
    }


}
