package com.yiyun.application.common.dto;

import java.util.List;

/**
 * 封装分页请求的响应参数类
 * User: DHC
 * Date: 2017/11/7
 * Time: 14:05
 * Version:V1.0
 */
public class Result<T> {
    /**
     * 符合条件的总记录数
     */
    private  int count;
    /**
     * 指定页码显示记录集合
     */
    private List<T> data;



    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int total) {
        this.count = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
