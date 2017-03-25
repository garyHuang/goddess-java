package com.bjike.goddess.market.to;

import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.market.enums.MarketCollectUnit;
import com.bjike.goddess.market.enums.MarketSendUnit;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

/**
 * 市场邮件发送定制
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-16T19:08:18.879 ]
 * @Description: [ 市场邮件发送定制 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MarketEmailTO extends BaseTO {

    /**
     * 行业
     */
    @NotBlank
    private String work;

    /**
     * 备注
     */
    private String remark;

    /**
     * 发送间隔
     */
    @NotBlank
    private Double sendNum;

    /**
     * 发送间隔和单位
     */
    private String sendNumAndUnit;

    /**
     * 发送单位
     */
    private MarketSendUnit marketSendUnit;

    /**
     * 汇总间隔
     */
    private MarketCollectUnit marketCollectUnit;

    /**
     * 发送对象
     */
    private String sendObject;

    /**
     * 发送对象数组
     */
    private List<String> sendObjectList;

    /**
     * 上次发送时间
     */
    private String lastSendTime;

    /**
     * 状态
     */
    private Status status;

    /**
     * 创建人
     */
    private String createPersion;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;

    /**
     * 行业字符串数组
     */
    private String[] works;


    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getSendNum() {
        return sendNum;
    }

    public void setSendNum(Double sendNum) {
        this.sendNum = sendNum;
    }

    public String getSendNumAndUnit() {
        return sendNumAndUnit;
    }

    public void setSendNumAndUnit(String sendNumAndUnit) {
        this.sendNumAndUnit = sendNumAndUnit;
    }

    public MarketSendUnit getMarketSendUnit() {
        return marketSendUnit;
    }

    public void setMarketSendUnit(MarketSendUnit marketSendUnit) {
        this.marketSendUnit = marketSendUnit;
    }

    public MarketCollectUnit getMarketCollectUnit() {
        return marketCollectUnit;
    }

    public void setMarketCollectUnit(MarketCollectUnit marketCollectUnit) {
        this.marketCollectUnit = marketCollectUnit;
    }

    public String getSendObject() {
        return sendObject;
    }

    public void setSendObject(String sendObject) {
        this.sendObject = sendObject;
    }

    public List<String> getSendObjectList() {
        return sendObjectList;
    }

    public void setSendObjectList(List<String> sendObjectList) {
        this.sendObjectList = sendObjectList;
    }

    public String getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(String lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCreatePersion() {
        return createPersion;
    }

    public void setCreatePersion(String createPersion) {
        this.createPersion = createPersion;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String[] getWorks() {
        return works;
    }

    public void setWorks(String[] works) {
        this.works = works;
    }
}