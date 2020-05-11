package com.yiyun.application.pojo.po;

import java.util.Date;

public class GlobalDictionary {
    private String id;

    private String codeType;

    private String codeValue;

    private String codeExplain;

    private String parametersClassified;

    private Date gmtCreate;

    private Date gmtModified;

    private Byte isSign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    public String getCodeExplain() {
        return codeExplain;
    }

    public void setCodeExplain(String codeExplain) {
        this.codeExplain = codeExplain == null ? null : codeExplain.trim();
    }

    public String getParametersClassified() {
        return parametersClassified;
    }

    public void setParametersClassified(String parametersClassified) {
        this.parametersClassified = parametersClassified == null ? null : parametersClassified.trim();
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