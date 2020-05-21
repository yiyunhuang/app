package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.ApplicationAccount;
import com.yiyun.application.pojo.po.ApplicationAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationAccountMapper {
    int countByExample(ApplicationAccountExample example);

    int deleteByExample(ApplicationAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationAccount record);

    int insertSelective(ApplicationAccount record);

    List<ApplicationAccount> selectByExample(ApplicationAccountExample example);

    ApplicationAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationAccount record, @Param("example") ApplicationAccountExample example);

    int updateByExample(@Param("record") ApplicationAccount record, @Param("example") ApplicationAccountExample example);

    int updateByPrimaryKeySelective(ApplicationAccount record);

    int updateByPrimaryKey(ApplicationAccount record);
}