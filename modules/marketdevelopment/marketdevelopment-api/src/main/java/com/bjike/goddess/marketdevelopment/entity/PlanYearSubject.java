package com.bjike.goddess.marketdevelopment.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.marketdevelopment.enums.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 年计划(科目方向)
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-12-08 03:34 ]
 * @Description: [ 年计划(科目方向) ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "marketdevelopment_planyearsubject")
public class PlanYearSubject extends BaseEntity {

    /**
     * 业务方向类型id
     */
    @Column(name = "businessDataId", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '业务方向类型id'")
    private String businessDataId;

    /**
     * 业务方向科目
     */
    @Column(name = "subject", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '业务方向科目'")
    private String subject;

    /**
     * 各业务科目同一业务类型中占比(%)
     */
    @Column(name = "proportion", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '各业务科目同一业务类型中占比(%)'")
    private Double proportion;

    /**
     * 各业务科目年度占比(%)
     */
    @Column(name = "yearProportion", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '各业务科目年度占比(%)'")
    private Double yearProportion;

    /**
     * 各业务科目计划金额（万元）
     */
    @Column(name = "planMoney", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '各业务科目计划金额（万元）'")
    private Double planMoney;

    /**
     * 各业务科目实际金额（万元）
     */
    @Column(name = "actualMoney", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '各业务科目实际金额（万元）'")
    private Double actualMoney;

    /**
     * 各业务科目差异金额（万元）
     */
    @Column(name = "diffMoney", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '各业务科目差异金额（万元）'")
    private Double diffMoney;

    /**
     * 现有业务可发展对象
     */
    @Column(name = "deveBusiness", nullable = false, columnDefinition = "INTEGER   COMMENT '现有业务可发展对象'")
    private Integer deveBusiness;

    /**
     * 各科目年度总任务量
     */
    @Column(name = "total", nullable = false, columnDefinition = "INTEGER   COMMENT '各科目年度总任务量'")
    private Integer total;

    /**
     * 状态
     */
    @Column(name = "status", nullable = false, columnDefinition = "TINYINT(2) DEFAULT 0   COMMENT '状态'",insertable = false)
    private Status status;


    public String getBusinessDataId() {
        return businessDataId;
    }

    public void setBusinessDataId(String businessDataId) {
        this.businessDataId = businessDataId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public Double getYearProportion() {
        return yearProportion;
    }

    public void setYearProportion(Double yearProportion) {
        this.yearProportion = yearProportion;
    }

    public Double getPlanMoney() {
        return planMoney;
    }

    public void setPlanMoney(Double planMoney) {
        this.planMoney = planMoney;
    }

    public Double getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(Double actualMoney) {
        this.actualMoney = actualMoney;
    }

    public Double getDiffMoney() {
        return diffMoney;
    }

    public void setDiffMoney(Double diffMoney) {
        this.diffMoney = diffMoney;
    }

    public Integer getDeveBusiness() {
        return deveBusiness;
    }

    public void setDeveBusiness(Integer deveBusiness) {
        this.deveBusiness = deveBusiness;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}