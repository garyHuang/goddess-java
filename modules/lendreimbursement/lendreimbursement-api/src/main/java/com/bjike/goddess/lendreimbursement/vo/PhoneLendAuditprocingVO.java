package com.bjike.goddess.lendreimbursement.vo;

import com.bjike.goddess.lendreimbursement.enums.LendStatus;

import java.time.LocalDate;

/**
 * 申请借款表现层对象
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-06 10:01 ]
 * @Description: [ 申请借款表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class PhoneLendAuditprocingVO {

    /**
     * 操作时间
     */
    private String auditTime;

    /**
     * 过程
     */
    private String procing;

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getProcing() {
        return procing;
    }

    public void setProcing(String procing) {
        this.procing = procing;
    }
}