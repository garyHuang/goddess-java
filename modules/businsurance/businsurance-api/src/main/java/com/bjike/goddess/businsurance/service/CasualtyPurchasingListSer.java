package com.bjike.goddess.businsurance.service;

import com.bjike.goddess.businsurance.bo.CasualtyPurchasingListBO;
import com.bjike.goddess.businsurance.dto.CasualtyPurchasingListDTO;
import com.bjike.goddess.businsurance.entity.CasualtyPurchasingList;
import com.bjike.goddess.businsurance.to.CasualtyPurchasingListTO;
import com.bjike.goddess.businsurance.to.GuidePermissionTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;

import java.util.List;

/**
 * 团体意外险购买名单业务接口
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-09-26 10:24 ]
 * @Description: [ 团体意外险购买名单业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface CasualtyPurchasingListSer extends Ser<CasualtyPurchasingList, CasualtyPurchasingListDTO> {
    /**
     * 下拉导航权限
     */
    default Boolean sonPermission() throws SerException {
        return null;
    }


    /**
     * 功能导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }
    /**
     * 团体意外险购买名单总条数
     */
    default Long countCasualty(CasualtyPurchasingListDTO casualtyPurchasingListDTO) throws SerException {
        return null;
    }
    /**
     * 一个团体意外险购买名单
     */
    default CasualtyPurchasingListBO getOneCasualty(String id) throws SerException {
        return null;
    }

    /**
     * 团体意外险购买名单
     *
     * @return class CasualtyPurchasingListBO
     */
    default List<CasualtyPurchasingListBO> listCasualty(CasualtyPurchasingListDTO casualtyPurchasingListDTO) throws SerException {
        return null;
    }

    /**
     * 添加
     *
     * @param casualtyPurchasingListTO 团体意外险购买名单
     * @return class CasualtyPurchasingListBO
     */
    default CasualtyPurchasingListBO addCasualty(CasualtyPurchasingListTO casualtyPurchasingListTO) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param casualtyPurchasingListTO 团体意外险购买名单
     * @return class CasualtyPurchasingListBO
     */
    default CasualtyPurchasingListBO editCasualty(CasualtyPurchasingListTO casualtyPurchasingListTO) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id id
     */
    default void deleteCasualty(String id) throws SerException {
        return;
    }

    /**
     * 导出Excel
     *
     * @throws SerException
     */
    byte[] exportExcel() throws SerException;

    /**
     * 导出Excel
     *
     * @throws SerException
     */
    byte[] templateExport() throws SerException;

    /**
     * 导入
     *
     * @param casualtyPurchasingListTOS 工龄补助
     */
    void importExcel(List<CasualtyPurchasingListTO> casualtyPurchasingListTOS) throws SerException;

    /**
     * 根据生效时间获取已增员人数及购买人数
     * @param date 时间数组
     * @return
     * @throws SerException
     */
    default Integer findCasualtyIncreaseNum(String[] date)throws SerException{
        return null;
    }
    /**
     * 根据生效时间获取已增员人数及购买人数
     * @param endDate 结束时间
     * @return
     * @throws SerException
     */
    default Integer findCasualtyIncreaseNum(String endDate)throws SerException{
        return null;
    }
}