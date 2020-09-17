package com.yiyun.application.web;

import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.common.util.JsonUtils;
import com.yiyun.application.pojo.po.ApplicationFinance;
import com.yiyun.application.service.FinanceService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName financeAction
 * @Description TODO 记账功能开发
 * @program: application
 * @date 2020/4/23 22:32
 **/
@Controller
@Scope("prototype")
public class FinanceAction {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final FinanceService financeService;
    @Autowired
    public FinanceAction(FinanceService financeService) {
        this.financeService = financeService;
    }

    @RequestMapping("/financeAction")
    public String  index(){
        logger.info("financeAction.index");
        return "finance/finance";
    }


    @RequestMapping(value="/financeEditor", method= RequestMethod.GET)
    public String  financeEditor(HttpServletRequest request, String id){
        logger.info("financeAction.financeEditor");
        request.setAttribute("id",id);
        return "finance/financeEditor";
    }


    @ResponseBody
    @RequestMapping(value="/finances", method= RequestMethod.GET)
    public Result<ApplicationFinance> getFinancesByPage(Page page, String fa) {
        logger.info("financeAction.getFinancesByPage");
        Result<ApplicationFinance> list = null;
        try {
            ApplicationFinance applicationFinance = new ApplicationFinance();
            List< ApplicationFinance > aflist = new ArrayList< ApplicationFinance >();
            if (StringUtils.isNotBlank(fa)) {
                aflist = JsonUtils.jsonToList(fa, ApplicationFinance.class);
            }
            if(aflist.size()>0){
                applicationFinance=aflist.get(0);
            }
            list = financeService.listFinanceServiceByPage(page, applicationFinance);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            list.setCode("1");
            e.printStackTrace();
        }
        list.setCode("0");
        return list;
    }




}
