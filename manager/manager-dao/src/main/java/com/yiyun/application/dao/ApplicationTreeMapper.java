package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.ApplicationTree;
import com.yiyun.application.pojo.po.ApplicationTreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationTreeMapper {
    int countByExample(ApplicationTreeExample example);

    int deleteByExample(ApplicationTreeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ApplicationTree record);

    int insertSelective(ApplicationTree record);

    List<ApplicationTree> selectByExample(ApplicationTreeExample example);

    ApplicationTree selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ApplicationTree record, @Param("example") ApplicationTreeExample example);

    int updateByExample(@Param("record") ApplicationTree record, @Param("example") ApplicationTreeExample example);

    int updateByPrimaryKeySelective(ApplicationTree record);

    int updateByPrimaryKey(ApplicationTree record);
}