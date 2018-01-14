package com.bjike.goddess.recruit.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

import javax.enterprise.inject.New;

/**
 * 转正图形展示横坐标传输对象
 * @Author: [lijuntao]
 * @Date: [2017-09-09 15:32]
 * @Description: [转正图形展示纵坐标传数对象 ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class XAxisBO extends BaseBO{
    /**
     * 数据
     */
    private String type = "category";
    private boolean boundaryGap = false;
    private String[] data = {" ","一季","二季","三季","四季"," "};
    private AxisLabelBO axisLabel = new AxisLabelBO();

    public boolean isBoundaryGap() {
        return boundaryGap;
    }

    public void setBoundaryGap(boolean boundaryGap) {
        this.boundaryGap = boundaryGap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public AxisLabelBO getAxisLabel() {
        return axisLabel;
    }

    public void setAxisLabel(AxisLabelBO axisLabel) {
        this.axisLabel = axisLabel;
    }
}
