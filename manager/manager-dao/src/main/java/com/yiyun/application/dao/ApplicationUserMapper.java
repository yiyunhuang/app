package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.ApplicationUser;
import com.yiyun.application.pojo.po.ApplicationUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationUserMapper {
    int countByExample(ApplicationUserExample example);

    int deleteByExample(ApplicationUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationUser record);

    int insertSelective(ApplicationUser record);

    List<ApplicationUser> selectByExample(ApplicationUserExample example);

    ApplicationUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationUser record, @Param("example") ApplicationUserExample example);

    int updateByExample(@Param("record") ApplicationUser record, @Param("example") ApplicationUserExample example);

    int updateByPrimaryKeySelective(ApplicationUser record);

    int updateByPrimaryKey(ApplicationUser record);
}