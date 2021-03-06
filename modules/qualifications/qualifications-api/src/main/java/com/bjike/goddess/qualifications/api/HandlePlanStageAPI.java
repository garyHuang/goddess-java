package com.bjike.goddess.qualifications.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.qualifications.bo.HandlePlanStageBO;
import com.bjike.goddess.qualifications.to.GuidePermissionTO;
import com.bjike.goddess.qualifications.to.HandlePlanStageTO;

import java.util.List;

/**
 * 资质办理计划阶段划分业务接口
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-31 04:55 ]
 * @Description: [ 资质办理计划阶段划分业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface HandlePlanStageAPI {

    /**
     * 保存
     *
     * @param to 资质办理计划阶段传输对象
     * @return
     * @throws SerException
     */
    default HandlePlanStageBO save(HandlePlanStageTO to) throws SerException {
        return null;
    }

    /**
     * 修改
     *
     * @param to 资质办理计划阶段传输对象
     * @return
     * @throws SerException
     */
    default HandlePlanStageBO update(HandlePlanStageTO to) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id 资质办理计划阶段id
     * @return
     * @throws SerException
     */
    default HandlePlanStageBO delete(String id) throws SerException {
        return null;
    }

    /**
     * 根据办理计划id集合查询计划阶段
     *
     * @param planIds
     * @return
     * @throws SerException
     */
    default List<HandlePlanStageBO> findByPlanIds(String[] planIds) throws SerException {
        return null;
    }

    /**
     * 根据办理计划id查询计划阶段
     *
     * @param planId 办理计划ID
     * @return
     * @throws SerException
     */
    default List<HandlePlanStageBO> findByPlan(String planId) throws SerException {
        return null;
    }

    /**
     * 根据资质办理ID查询计划阶段
     *
     * @param handleId 资质办理ID
     * @return
     * @throws SerException
     */
    default List<HandlePlanStageBO> findByHandle(String handleId) throws SerException {
        return null;
    }

    /**
     * 根据id获取数据
     *
     * @param id 数据id
     * @return
     * @throws SerException
     */
    default HandlePlanStageBO getById(String id) throws SerException {
        return null;
    }
    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }
}