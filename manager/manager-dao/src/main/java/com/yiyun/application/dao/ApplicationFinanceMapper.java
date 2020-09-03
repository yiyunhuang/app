package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.ApplicationFinance;
import com.yiyun.application.pojo.po.ApplicationFinanceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationFinanceMapper {
    int countByExample(ApplicationFinanceExample example);

    int deleteByExample(ApplicationFinanceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationFinance record);

    int insertSelective(ApplicationFinance record);

    List<ApplicationFinance> selectByExampleWithBLOBs(ApplicationFinanceExample example);

    List<ApplicationFinance> selectByExample(ApplicationFinanceExample example);

    ApplicationFinance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationFinance record, @Param("example") ApplicationFinanceExample example);

    int updateByExampleWithBLOBs(@Param("record") ApplicationFinance record, @Param("example") ApplicationFinanceExample example);

    int updateByExample(@Param("record") ApplicationFinance record, @Param("example") ApplicationFinanceExample example);

    int updateByPrimaryKeySelective(ApplicationFinance record);

    int updateByPrimaryKeyWithBLOBs(ApplicationFinance record);

    int updateByPrimaryKey(ApplicationFinance record);
}