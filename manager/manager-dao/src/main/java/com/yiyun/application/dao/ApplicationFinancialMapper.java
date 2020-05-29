package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.ApplicationFinancial;
import com.yiyun.application.pojo.po.ApplicationFinancialExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationFinancialMapper {
    int countByExample(ApplicationFinancialExample example);

    int deleteByExample(ApplicationFinancialExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationFinancial record);

    int insertSelective(ApplicationFinancial record);

    List<ApplicationFinancial> selectByExampleWithBLOBs(ApplicationFinancialExample example);

    List<ApplicationFinancial> selectByExample(ApplicationFinancialExample example);

    ApplicationFinancial selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationFinancial record, @Param("example") ApplicationFinancialExample example);

    int updateByExampleWithBLOBs(@Param("record") ApplicationFinancial record, @Param("example") ApplicationFinancialExample example);

    int updateByExample(@Param("record") ApplicationFinancial record, @Param("example") ApplicationFinancialExample example);

    int updateByPrimaryKeySelective(ApplicationFinancial record);

    int updateByPrimaryKeyWithBLOBs(ApplicationFinancial record);

    int updateByPrimaryKey(ApplicationFinancial record);
}