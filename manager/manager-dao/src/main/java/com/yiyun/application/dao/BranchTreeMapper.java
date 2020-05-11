package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.BranchTree;
import com.yiyun.application.pojo.po.BranchTreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BranchTreeMapper {
    int countByExample(BranchTreeExample example);

    int deleteByExample(BranchTreeExample example);

    int deleteByPrimaryKey(String id);

    int insert(BranchTree record);

    int insertSelective(BranchTree record);

    List<BranchTree> selectByExample(BranchTreeExample example);

    BranchTree selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BranchTree record, @Param("example") BranchTreeExample example);

    int updateByExample(@Param("record") BranchTree record, @Param("example") BranchTreeExample example);

    int updateByPrimaryKeySelective(BranchTree record);

    int updateByPrimaryKey(BranchTree record);
}