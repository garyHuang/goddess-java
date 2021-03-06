package com.bjike.goddess.staffshares.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 买入记录表业务传输对象
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-08-04 10:09 ]
 * @Description: [ 买入记录表业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class BuyscheduleCollectBO extends BaseBO {

    /**
     * 持股人
     */
    private String shareholder;
//
//    /**
//     * 方案代码
//     */
//    private String code;
//
//    /**
//     * 方案名称
//     */
//    private String name;

    /**
     * 购入股数
     */
    private Long purchaseNum;

    /**
     * 买入价格
     */
    private Double buyPrice;
//
//    /**
//     * 发行价格
//     */
//    private Double price;

    /**
     * 买入金额
     */
    private Double totalBuyPrice;

    /**
     * 发行金额
     */
    private Double totalPrice;

//    /**
//     * 出售人
//     */
//    private String sell;
//
//    /**
//     * 交易时间
//     */
//    private String time;


    public String getShareholder() {
        return shareholder;
    }

    public void setShareholder(String shareholder) {
        this.shareholder = shareholder;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getTotalBuyPrice() {
        return totalBuyPrice;
    }

    public void setTotalBuyPrice(Double totalBuyPrice) {
        this.totalBuyPrice = totalBuyPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Long purchaseNum) {
        this.purchaseNum = purchaseNum;
    }
}