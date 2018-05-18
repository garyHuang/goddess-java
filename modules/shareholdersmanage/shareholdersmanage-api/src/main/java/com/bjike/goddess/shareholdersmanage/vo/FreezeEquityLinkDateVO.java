package com.bjike.goddess.shareholdersmanage.vo;

/**
 * 冻结股权链接数据业务传输对象
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-08-18 02:41 ]
 * @Description: [ 冻结股权链接数据业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class FreezeEquityLinkDateVO{

    /**
     * 持股数量
     */
    private Integer totalHoldNum;

    /**
     * 金额
     */
    private Double totalAmount;

    public Integer getTotalHoldNum() {
        return totalHoldNum;
    }

    public void setTotalHoldNum(Integer totalHoldNum) {
        this.totalHoldNum = totalHoldNum;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}