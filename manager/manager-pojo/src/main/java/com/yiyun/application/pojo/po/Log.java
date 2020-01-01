package com.yiyun.application.pojo.po;

import java.util.Date;

public class Log {
    private Long id;

    private String type;

    private String datajsonold;

    private String datajsonnew;

    private Date date;

    private Integer sign;

    private Integer tabid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDatajsonold() {
        return datajsonold;
    }

    public void setDatajsonold(String datajsonold) {
        this.datajsonold = datajsonold == null ? null : datajsonold.trim();
    }

    public String getDatajsonnew() {
        return datajsonnew;
    }

    public void setDatajsonnew(String datajsonnew) {
        this.datajsonnew = datajsonnew == null ? null : datajsonnew.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }
}