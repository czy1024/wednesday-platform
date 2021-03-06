package com.luna.wednesday.platform.entity;

import java.util.Date;

/**
 * (tb_project#)
 *
 * @author luna
 * @since 2021/03/16 13:29:43
 */
public class ProjectDO {

    private static final long serialVersionUID = 1L;

    /** id (Not Null) */
    private Long              id;
    /** 创建时间 (Not Null) */
    private Date              createTime;
    /** 修改时间 (Not Null) */
    private Date              modifiedTime;
    /** 版本 (Not Null) */
    private Integer           version;
    /** (Not Null) */
    private String            type;
    /** (Not Null) */
    private Long              calculationObjectId;
    /** 状态 (Not Null) */
    private String            status;
    /** 扩展 (Not Null) */
    private String            content;
    /**  */
    private String            remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getCalculationObjectId() {
        return calculationObjectId;
    }

    public void setCalculationObjectId(Long calculationObjectId) {
        this.calculationObjectId = calculationObjectId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

}
