package com.yiyun.application.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class FinancialTask {
    private String id;

    private String financialType;

    private BigDecimal totalAmount;

    private BigDecimal moneyChange;

    private String userId;

    private String financialRemark;

    private Date gmtCreate;

    private Date gmtModified;

    private Byte isSign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFinancialType() {
        return financialType;
    }

    public void setFinancialType(String financialType) {
        this.financialType = financialType == null ? null : financialType.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getMoneyChange() {
        return moneyChange;
    }

    public void setMoneyChange(BigDecimal moneyChange) {
        this.moneyChange = moneyChange;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFinancialRemark() {
        return financialRemark;
    }

    public void setFinancialRemark(String financialRemark) {
        this.financialRemark = financialRemark == null ? null : financialRemark.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Byte getIsSign() {
        return isSign;
    }

    public void setIsSign(Byte isSign) {
        this.isSign = isSign;
    }
}