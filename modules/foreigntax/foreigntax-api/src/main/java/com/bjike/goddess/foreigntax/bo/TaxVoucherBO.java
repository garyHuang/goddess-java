package com.bjike.goddess.foreigntax.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 税金管理记账凭证记录业务传输对象
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-10-17 04:23 ]
 * @Description: [ 税金管理记账凭证记录业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class TaxVoucherBO extends BaseBO {

    /**
     * 时间
     */
    private String taxTime;

    /**
     * 记账凭证id
     */
    private String voucherId;

    /**
     * 应缴金额
     */
    private Double totalMoney;


    public String getTaxTime() {
        return taxTime;
    }

    public void setTaxTime(String taxTime) {
        this.taxTime = taxTime;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}