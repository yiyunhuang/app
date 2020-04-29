package com.yiyun.application.common.dto;

/**
 * 封装分页请求的参数类
 * User: DHC
 * Date: 2017/11/7
 * Time: 14:02
 * Version:V1.0
 */
public class Page {
    /**
     * 当前页的页码
     */
    private int page;
    /**
     * 每页显示的条数
     */
    private int limit;
    /**
     * 偏移量（当前页的第一条记录的索引号）
     */

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getlimit() {
        return limit;
    }

    public void setlimit(int limit) {
        this.limit = limit;
    }

    /**
     * 获取偏移量，不需要手工设值
     * @return
     */
    public int getOffset() {
        return (page-1)*limit;
    }

}
