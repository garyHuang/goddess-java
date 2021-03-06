package com.bjike.goddess.capability.service;

import com.bjike.goddess.capability.bo.CompleteProBO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.capability.entity.CompletePro;
import com.bjike.goddess.capability.dto.CompleteProDTO;

/**
 * 公司参与项目数业务接口
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-06-16 06:22 ]
 * @Description: [ 公司参与项目数业务接口 ]
 * @Version: [ v1.0.0 ]
 */
public interface CompleteProSer extends Ser<CompletePro, CompleteProDTO> {
    /**
     * 添加
     *
     * @param completePros 公司参与项目数信息
     * @param companyId    公司id
     * @return class CompleteProBO
     */
    default CompleteProBO addCompletePro(String[] completePros, String companyId) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param completePros 公司参与项目数信息
     * @param companyId    公司id
     * @return class CompleteProBO
     */
    default CompleteProBO editCompletePro(String[] completePros, String companyId) throws SerException {
        return null;
    }

    /**
     * 删除公司参与项目数
     *
     * @param id id
     */
    default void deleteCompletePro(String id) throws SerException {
        return;
    }

}