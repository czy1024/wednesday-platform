package com.luna.wednesday.platform.entity;

import java.util.Date;

/**
 * (tb_task#)
 *
 * @author luna
 * @since 2021/02/23 22:55:35
 */
public class TaskDO {

    private static final long serialVersionUID = 1L;

    /** id (Not Null) */
    private Long              id;
    /** 创建时间 (Not Null) */
    private Date              createTime;
    /** 修改时间 (Not Null) */
    private Date              modifiedTime;
    /** 版本 (Not Null) */
    private Integer           version;
    /** 项目id (Not Null) */
    private Long              projectId;
    /** task状态 (Not Null) */
    private String            status;

    private String            content;

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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
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
        this.content = content;
    }
}
