package com.bjike.goddess.archive.to;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.common.api.type.Status;

import javax.validation.constraints.NotNull;

/**
 * 劳动关系类型
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-12 11:05 ]
 * @Description: [ 劳动关系类型 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class LaborRelationTO extends BaseTO {

    /**
     * 类型名称
     */
    @NotNull(message = "类型名称不能为空",groups = {ADD.class, EDIT.class})
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态
     */
    private Status status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}