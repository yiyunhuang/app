package com.yiyun.application.pojo.po;

import java.util.Date;

public class BranchTree {
    private Long id;

    private Long parentsId;

    private String treeLocation;

    private String treeTitle;

    private String treeDescription;

    private Integer treeType;

    private String treeRemark;

    private Date gmtCreate;

    private Date gmtModified;

    private Byte isSign;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentsId() {
        return parentsId;
    }

    public void setParentsId(Long parentsId) {
        this.parentsId = parentsId;
    }

    public String getTreeLocation() {
        return treeLocation;
    }

    public void setTreeLocation(String treeLocation) {
        this.treeLocation = treeLocation == null ? null : treeLocation.trim();
    }

    public String getTreeTitle() {
        return treeTitle;
    }

    public void setTreeTitle(String treeTitle) {
        this.treeTitle = treeTitle == null ? null : treeTitle.trim();
    }

    public String getTreeDescription() {
        return treeDescription;
    }

    public void setTreeDescription(String treeDescription) {
        this.treeDescription = treeDescription == null ? null : treeDescription.trim();
    }

    public Integer getTreeType() {
        return treeType;
    }

    public void setTreeType(Integer treeType) {
        this.treeType = treeType;
    }

    public String getTreeRemark() {
        return treeRemark;
    }

    public void setTreeRemark(String treeRemark) {
        this.treeRemark = treeRemark == null ? null : treeRemark.trim();
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