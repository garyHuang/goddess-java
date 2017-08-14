package com.bjike.goddess.salarymanage.service;

import com.bjike.goddess.assistance.bo.AgeAssistBO;
import com.bjike.goddess.assistance.bo.ComputerAssistBO;
import com.bjike.goddess.assistance.bo.HotAssistBO;
import com.bjike.goddess.assistance.bo.HouseAssistBO;
import com.bjike.goddess.assistance.dto.AgeAssistDTO;
import com.bjike.goddess.assistance.dto.ComputerAssistDTO;
import com.bjike.goddess.assistance.dto.HotAssistDTO;
import com.bjike.goddess.assistance.dto.HouseAssistDTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.managementpromotion.entity.LevelShow;
import com.bjike.goddess.salarymanage.bo.SalaryBasicBO;
import com.bjike.goddess.salarymanage.bo.SalaryInformationBO;
import com.bjike.goddess.salarymanage.dto.SalaryBasicDTO;
import com.bjike.goddess.salarymanage.entity.SalaryInformation;
import com.bjike.goddess.salarymanage.dto.SalaryInformationDTO;
import com.bjike.goddess.salarymanage.to.ExportSalaryInformationTO;
import com.bjike.goddess.salarymanage.to.GuidePermissionTO;
import com.bjike.goddess.salarymanage.to.SalaryBasicTO;
import com.bjike.goddess.salarymanage.to.SalaryInformationTO;
import com.bjike.goddess.staffentry.bo.EntryBasicInfoBO;

import java.util.List;

/**
* 薪资管理业务接口
* @Author:			[ jiangzaixuan ]
* @Date:			[  2017-07-31 01:45 ]
* @Description:	[ 薪资管理业务接口 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface SalaryInformationSer extends Ser<SalaryInformation, SalaryInformationDTO> {


    /**
     * 下拉导航权限
     */
    default Boolean sonPermission() throws SerException {
        return null;
    }
    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }
    /**
     * 查询列表
     * @param dto
     * @throws SerException
     */
    default List<SalaryInformationBO> pageList(SalaryInformationDTO dto) throws SerException{
        return null;
    }

    /**
     * 添加
     * @param to
     * @throws SerException
     */
    default SalaryInformationBO addSalaryInformation(SalaryInformationTO to) throws SerException{
        return null;
    }

    /**
     * 修改
     * @param to
     * @throws SerException
     */
    default SalaryInformationBO editSalaryInformation(SalaryInformationTO to) throws SerException{
        return null;
    }

    /**
     * 删除
     * @param id
     * @throws SerException
     */
    default void deleteSalaryInformation(String id) throws SerException{
        return;
    }

    /**
     * 导入
     * @param toList
     * @throws SerException
     */
    default void leadExcel(List<SalaryInformationTO> toList) throws SerException{
        return;
    };

    /**
     * 导出
     * @param to
     * @return
     * @throws SerException
     */
    byte[] exportExcel(ExportSalaryInformationTO to) throws SerException;

    /**
     * 获取所有的计薪周期开始时间和计薪周期结束时间
     * @throws SerException
     */
    default List<String> findTime() throws SerException{
        return null;
    }

    /**
     * 导出Excel模板
     * @throws SerException
     */
    byte[] templateExport() throws SerException;

    /**
     * 通过员工编号来查询管理等级
     * @param employeeId
     * @throws SerException
     */
    LevelShow findByEmployeeId(String employeeId) throws SerException;

    /**
     * 根据id来查询入职基本信息
     * @param employeeId
     * @return
     * @throws SerException
     */
    List<EntryBasicInfoBO> getByEmpNumber(String employeeId) throws SerException;

    /**
     * 查询总条数
     * @param dto
     * @throws SerException
     */
    Long count(SalaryInformationDTO dto) throws SerException;

//    /**
//     * 查询高温补助
//     *
//     * @throws SerException
//     */
//    List<HotAssistBO> findHotAssist(SalaryInformationDTO dto) throws SerException;
//
//    /**
//     * 查询住宿补助
//     *
//     * @throws SerException
//     */
//    List<HouseAssistBO> findHouseAssist(SalaryInformationDTO dto) throws SerException;
//
//    /**
//     * 查看电脑补助
//     */
//    List<ComputerAssistBO> findComputerAssist(SalaryInformationDTO dto) throws SerException;
//
//    /**
//     * 查看工龄补助
//     */
//    List<AgeAssistBO> findAgeAssist(SalaryInformationDTO dto) throws SerException;
 }