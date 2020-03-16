package com.yiyun.application.dao;

import com.yiyun.application.pojo.po.Yyuser;
import com.yiyun.application.pojo.po.YyuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YyuserMapper {
    int countByExample(YyuserExample example);

    int deleteByExample(YyuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Yyuser record);

    int insertSelective(Yyuser record);

    List<Yyuser> selectByExample(YyuserExample example);

    Yyuser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Yyuser record, @Param("example") YyuserExample example);

    int updateByExample(@Param("record") Yyuser record, @Param("example") YyuserExample example);

    int updateByPrimaryKeySelective(Yyuser record);

    int updateByPrimaryKey(Yyuser record);
}