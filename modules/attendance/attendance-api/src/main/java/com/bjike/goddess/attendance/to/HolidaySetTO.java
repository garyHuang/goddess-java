package com.bjike.goddess.attendance.to;

import com.bjike.goddess.attendance.enums.HolidayType;
import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.to.BaseTO;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 假期设置
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-10-20 11:54 ]
 * @Description: [ 假期设置 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class HolidaySetTO extends BaseTO {

    /**
     * 假期名称
     */
    @NotBlank(groups = {ADD.class, EDIT.class},message = "假期名称不能为空")
    private String name;

    /**
     * 假期天数
     */
    @NotNull(groups = {ADD.class, EDIT.class},message = "假期天数不能为空")
    private Double day;

    /**
     * 假期类型
     */
    @NotNull(groups = {ADD.class, EDIT.class},message = "假期类型不能为空")
    private HolidayType holidayType;

    /**
     * 假期开始时间
     */
    @NotBlank(groups = {ADD.class, EDIT.class},message = "假期开始时间不能为空")
    private String startTime;

    /**
     * 假期结束时间
     */
    @NotBlank(groups = {ADD.class, EDIT.class},message = "假期结束时间不能为空")
    private String endTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    @NotBlank(groups = {ADD.class, EDIT.class},message = "创建人不能为空")
    private String creater;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public HolidayType getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(HolidayType holidayType) {
        this.holidayType = holidayType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
}