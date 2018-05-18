package com.bjike.goddess.materialreceive.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.materialreceive.bo.ProjectGroupReceiveBO;
import com.bjike.goddess.materialreceive.dto.ProjectGroupReceiveDTO;
import com.bjike.goddess.materialreceive.entity.ProjectGroupReceive;
import com.bjike.goddess.materialreceive.excel.SonPermissionObject;
import com.bjike.goddess.materialreceive.to.GuidePermissionTO;
import com.bjike.goddess.materialreceive.to.ProjectGroupReceiveTO;

import java.util.List;

/**
 * 项目组领用归还登记业务接口
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-24 05:52 ]
 * @Description: [ 项目组领用归还登记业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ProjectGroupReceiveSer extends Ser<ProjectGroupReceive, ProjectGroupReceiveDTO> {


    /**
     * 下拉导航权限
     */
    default List<SonPermissionObject> sonPermission() throws SerException {

        return null;
    }

    /**
     * 功能导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }
    /**
     * 分页查询项目组领用归还登记
     *
     * @return class ProjectGroupReceiveBO
     * @throws SerException
     */
    List<ProjectGroupReceiveBO> list(ProjectGroupReceiveDTO dto) throws SerException;

    /**
     * 保存项目组领用归还登记
     *
     * @param to 项目组领用归还登记to
     * @return class ProjectGroupReceiveBO
     * @throws SerException
     */
    ProjectGroupReceiveBO save(ProjectGroupReceiveTO to) throws SerException;

    /**
     * 根据id删除项目组领用归还登记
     *
     * @param id 项目组领用归还登记唯一标识
     * @throws SerException
     */
    void remove(String id) throws SerException;

    /**
     * 归还物资
     *
     * @param to 项目组领用归还登记to
     * @throws SerException
     */
    void returnMaterial(ProjectGroupReceiveTO to) throws SerException;

    /**
     * 更新更新项目组领用归还登记
     *
     * @param to 项目组领用归还登记to
     * @throws SerException
     */
    ProjectGroupReceive update(ProjectGroupReceiveTO to,String token) throws SerException;

}