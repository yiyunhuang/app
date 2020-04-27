package com.yiyun.application.common.dto;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName Query
 * @Description  查询条件
 * @program: application
 * @date 2020/4/27 0027 17:18
 **/
public class Query {
    private String query;
    private String status;
    public String getTitle() {
        return query;
    }

    public void setTitle(String query) {
        this.query = query;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
