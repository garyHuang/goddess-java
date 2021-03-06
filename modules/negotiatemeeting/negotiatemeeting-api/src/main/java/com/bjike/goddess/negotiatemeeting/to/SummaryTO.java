package com.bjike.goddess.negotiatemeeting.to;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.to.BaseTO;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 协商会议纪要
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-05-31 03:49 ]
 * @Description: [ 协商会议纪要 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class SummaryTO extends BaseTO {

    /**
     * 实际会议时间
     */
    @NotBlank(groups = {ADD.class, EDIT.class}, message = "实际会议时间不能为空")
    private String actualTime;

    /**
     * 实际参会人员
     */
    @NotNull(groups = {ADD.class, EDIT.class}, message = "实际参会人员不能为空")
    private String[] actualAttends;

    /**
     * 新增参会人员
     */
    @NotNull(groups = {ADD.class, EDIT.class}, message = "新增参会人员不能为空")
    private String[] addAttends;

    /**
     * 未参会人员
     */
    @NotNull(groups = {ADD.class, EDIT.class}, message = "未参会人员不能为空")
    private String[] notAttends;

    /**
     * 参会人数
     */
    @NotNull(groups = {ADD.class, EDIT.class}, message = "参会人数不能为空")
    @Min(value = 0,groups = {ADD.class, EDIT.class}, message = "参会人数必须大于0")
    private Integer num;

    /**
     * 最终协商结果
     */
    @NotBlank(groups = {ADD.class, EDIT.class}, message = "最终协商结果不能为空")
    private String result;

    /**
     * 会议记录人
     */
    @NotBlank(groups = {ADD.class, EDIT.class}, message = "会议记录人不能为空")
    private String recorder;

    /**
     * 协商会议组织内容信息
     */
    private String organizationId;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getActualTime() {
        return actualTime;
    }

    public void setActualTime(String actualTime) {
        this.actualTime = actualTime;
    }

    public String[] getActualAttends() {
        return actualAttends;
    }

    public void setActualAttends(String[] actualAttends) {
        this.actualAttends = actualAttends;
    }

    public String[] getAddAttends() {
        return addAttends;
    }

    public void setAddAttends(String[] addAttends) {
        this.addAttends = addAttends;
    }

    public String[] getNotAttends() {
        return notAttends;
    }

    public void setNotAttends(String[] notAttends) {
        this.notAttends = notAttends;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }
}