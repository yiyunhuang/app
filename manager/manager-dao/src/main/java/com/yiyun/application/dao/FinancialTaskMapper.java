package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.FinancialTask;
import com.yiyun.application.pojo.po.FinancialTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinancialTaskMapper {
    int countByExample(FinancialTaskExample example);

    int deleteByExample(FinancialTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FinancialTask record);

    int insertSelective(FinancialTask record);

    List<FinancialTask> selectByExample(FinancialTaskExample example);

    FinancialTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FinancialTask record, @Param("example") FinancialTaskExample example);

    int updateByExample(@Param("record") FinancialTask record, @Param("example") FinancialTaskExample example);

    int updateByPrimaryKeySelective(FinancialTask record);

    int updateByPrimaryKey(FinancialTask record);
}