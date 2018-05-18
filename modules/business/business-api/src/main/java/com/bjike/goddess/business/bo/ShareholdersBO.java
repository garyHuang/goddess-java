package com.bjike.goddess.business.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 股东和对应占股比例to
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-04-18 03:41 ]
 * @Description: [ 股东和对应占股比例to ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ShareholdersBO extends BaseBO {

    /**
     * 股东
     */
    private String shareholders;

    /**
     * 占股比例
     */
    private Double percentageShares;

    public String getShareholders() {
        return shareholders;
    }

    public void setShareholders(String shareholders) {
        this.shareholders = shareholders;
    }

    public Double getPercentageShares() {
        return percentageShares;
    }

    public void setPercentageShares(Double percentageShares) {
        this.percentageShares = percentageShares;
    }
}