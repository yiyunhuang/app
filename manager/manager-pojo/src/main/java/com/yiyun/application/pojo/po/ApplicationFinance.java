package com.yiyun.application.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class ApplicationFinance {
    private String id;

    private String financeType;

    private BigDecimal totalAmount;

    private BigDecimal moneyChange;

    private Integer sharesChange;

    private BigDecimal stockPrice;

    private String accountId;

    private String financeRemark;

    private Date gmtCreate;

    private Date gmtModified;

    private Byte isSign;

    private String fee;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getfinanceType() {
        return financeType;
    }

    public void setfinanceType(String financeType) {
        this.financeType = financeType == null ? null : financeType.trim();
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

    public Integer getSharesChange() {
        return sharesChange;
    }

    public void setSharesChange(Integer sharesChange) {
        this.sharesChange = sharesChange;
    }

    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getfinanceRemark() {
        return financeRemark;
    }

    public void setfinanceRemark(String financeRemark) {
        this.financeRemark = financeRemark == null ? null : financeRemark.trim();
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

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }
}