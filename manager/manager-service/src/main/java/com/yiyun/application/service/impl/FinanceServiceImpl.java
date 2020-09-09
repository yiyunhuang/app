package com.yiyun.application.service.impl;

import com.yiyun.application.common.dto.Page;
import com.yiyun.application.common.dto.Result;
import com.yiyun.application.common.util.yiyun;
import com.yiyun.application.dao.ApplicationFinanceCustomMapper;
import com.yiyun.application.dao.ApplicationFinanceMapper;
import com.yiyun.application.dao.GlobalDictionaryCustomMapper;
import com.yiyun.application.dao.GlobalDictionaryMapper;
import com.yiyun.application.pojo.po.ApplicationFinance;
import com.yiyun.application.pojo.po.GlobalDictionary;
import com.yiyun.application.service.DictionaryService;
import com.yiyun.application.service.FinanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName DictionaryServiceImpl
 * @Description  记账功能实现类
 * @program: application
 * @date 2020/4/27 0027 11:01
 **/
@Service
public class FinanceServiceImpl implements FinanceService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private ApplicationFinanceMapper financeDao;
    private ApplicationFinanceCustomMapper financeCustomDao;

    @Autowired
    public void setFinanceDao(ApplicationFinanceMapper financeDao) {
        this.financeDao = financeDao;
    }
    @Autowired
    public void setFinanceCustomDao(ApplicationFinanceCustomMapper financeCustomDao) {
        this.financeCustomDao = financeCustomDao;
    }



    @Override
    public Result<ApplicationFinance> listFinanceServiceByPage(Page page, ApplicationFinance record) {
        logger.info("DictionaryServiceImpl.listDictionaryByPage");
        ApplicationFinance af = new ApplicationFinance();
        Result<ApplicationFinance> result = null;
        try {
            //0 创建一个Map封装前台传递过来的参数
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("page", page);
            map.put("record", record);
            //1 创建一个响应参数实体类
            result = new Result<ApplicationFinance>();
            //2 对total进行设值(符合条件的总记录数)
            int count = financeCustomDao.countFinance(map);
            result.setCount(count);
            //3 对 data 进行设值(指定页码显示记录集合)
            List<ApplicationFinance> list = financeCustomDao.listFinancesByPage(map);
            result.setData(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }




}
