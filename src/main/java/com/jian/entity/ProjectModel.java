package com.jian.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * @Author: qtj
 * @Date: 2020/7/2 15:30
 * @Version
 */
public class ProjectModel {

    private int id;

    @SerializedName("project_id")
    private String projectId;

    @SerializedName("project_name")
    private String projectName;
    private int status;

    @SerializedName("work_date")
    private Date workDate;

    @SerializedName("normal_durate")
    private Double normalDurate;

    @SerializedName("extra_durate")
    private Double extraDurate;

    @SerializedName("apply_time")
    private Date applyTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Double getNormalDurate() {
        return normalDurate;
    }

    public void setNormalDurate(Double normalDurate) {
        this.normalDurate = normalDurate;
    }

    public Double getExtraDurate() {
        return extraDurate;
    }

    public void setExtraDurate(Double extraDurate) {
        this.extraDurate = extraDurate;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}
