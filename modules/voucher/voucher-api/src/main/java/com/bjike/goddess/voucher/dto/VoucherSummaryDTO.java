package com.bjike.goddess.voucher.dto;

import com.bjike.goddess.common.api.dto.BaseDTO;
import org.hibernate.validator.constraints.NotBlank;

public class VoucherSummaryDTO extends BaseDTO {
    /**
     * 地区
     */
    @NotBlank(message = "地区不能为空")
    private String area;

    /**
     * 项目名称
     */
    @NotBlank(message = "项目名称不能为空")
    private String projectName;
    /**
     * 项目组
     */
    @NotBlank(message = "项目组不能为空")
    private String projectGroup;

    /**
     * 开始时间
     */
    @NotBlank(message = "开始时间不能为空")
    private String startTime;
    /**
     * 结束时间
     */
    @NotBlank(message = "结束时间不能为空")
    private String endTime;
    /**
     * type
     */
    private String [] type;

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
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
}
