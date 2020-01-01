package com.yiyun.application.dao;


import com.yiyun.application.pojo.po.Tab;
import com.yiyun.application.pojo.po.TabExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TabMapper {
    int countByExample(TabExample example);

    int deleteByExample(TabExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tab record);

    int insertSelective(Tab record);

    List<Tab> selectByExample(TabExample example);

    Tab selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tab record, @Param("example") TabExample example);

    int updateByExample(@Param("record") Tab record, @Param("example") TabExample example);

    int updateByPrimaryKeySelective(Tab record);

    int updateByPrimaryKey(Tab record);
}