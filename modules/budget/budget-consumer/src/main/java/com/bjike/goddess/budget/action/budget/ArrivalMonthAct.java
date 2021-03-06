package com.bjike.goddess.budget.action.budget;

import com.bjike.goddess.budget.api.ArrivalMonthAPI;
import com.bjike.goddess.budget.bo.ArrivalMonthBO;
import com.bjike.goddess.budget.bo.ArrivalMonthCountBO;
import com.bjike.goddess.budget.bo.ArrivalWeekBO;
import com.bjike.goddess.budget.bo.OptionBO;
import com.bjike.goddess.budget.dto.ArrivalMonthDTO;
import com.bjike.goddess.budget.to.GuidePermissionTO;
import com.bjike.goddess.budget.vo.ArrivalMonthCountVO;
import com.bjike.goddess.budget.vo.ArrivalMonthVO;
import com.bjike.goddess.budget.vo.ArrivalWeekVO;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 地区收入月
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-05-02 04:06 ]
 * @Description: [ 地区收入月 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("arrivalmonth")
public class ArrivalMonthAct {
    @Autowired
    private ArrivalMonthAPI arrivalMonthAPI;

    /**
     * 功能导航权限
     *
     * @param guidePermissionTO 导航类型数据
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/guidePermission")
    public Result guidePermission(@Validated(GuidePermissionTO.TestAdd.class) GuidePermissionTO guidePermissionTO, BindingResult bindingResult, HttpServletRequest request) throws ActException {
        try {

            Boolean isHasPermission = arrivalMonthAPI.guidePermission(guidePermissionTO);
            if (!isHasPermission) {
                //int code, String msg
                return new ActResult(0, "没有权限", false);
            } else {
                return new ActResult(0, "有权限", true);
            }
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 查找
     *
     * @param dto     地区收入月分页信息
     * @param request 请求对象
     * @return class ArrivalMonthVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(ArrivalMonthDTO dto, HttpServletRequest request) throws ActException {
        try {
            List<ArrivalMonthBO> list = arrivalMonthAPI.list(dto);
            return ActResult.initialize(BeanTransform.copyProperties(list, ArrivalMonthVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 查找该月明细
     *
     * @param id      地区收入月id
     * @param request 请求对象
     * @return class ArrivalWeekVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/findDetail/{id}")
    public Result findDetail(@PathVariable String id, HttpServletRequest request) throws ActException {
        try {
            List<ArrivalWeekBO> list = arrivalMonthAPI.findDetail(id);
            return ActResult.initialize(BeanTransform.copyProperties(list, ArrivalWeekVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 汇总
     *
     * @param request 请求对象
     * @return class ArrivalMonthCountVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/count")
    public Result count(HttpServletRequest request) throws ActException {
        try {
            List<ArrivalMonthCountBO> list = arrivalMonthAPI.count();
            return ActResult.initialize(BeanTransform.copyProperties(list, ArrivalMonthCountVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 按地区汇总
     *
     * @param dto 地区收入月dto
     * @return class ArrivalMonthCountVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/conditionsCount")
    public Result conditionsCount(ArrivalMonthDTO dto, HttpServletRequest request) throws ActException {
        try {
            List<ArrivalMonthCountBO> list = arrivalMonthAPI.conditionsCount(dto);
            return ActResult.initialize(BeanTransform.copyProperties(list, ArrivalMonthCountVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 查询总记录数
     *
     * @param dto dto
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/countNum")
    public Result countNum(ArrivalMonthDTO dto) throws ActException {
        try {
            Long num = arrivalMonthAPI.countNum(dto);
            return ActResult.initialize(num);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 查找所有地区
     *
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/findAllArrivals")
    public Result findAllArrivals() throws ActException {
        try {
            List<String> list = arrivalMonthAPI.findAllArrivals();
            return ActResult.initialize(list);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 按条件汇总
     *
     * @param dto 地区收入月dto
     * @return class ArrivalMonthCountVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/collect")
    public Result collect(ArrivalMonthDTO dto, HttpServletRequest request) throws ActException {
        try {
            List<ArrivalMonthCountBO> list = arrivalMonthAPI.collect(dto);
            return ActResult.initialize(BeanTransform.copyProperties(list, ArrivalMonthCountVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 地区收入月图形化
     *
     * @return class OptionBO
     * @version v1
     */
    @GetMapping("v1/figureShow")
    public Result figureShow() throws ActException {
        try {
            OptionBO bo = arrivalMonthAPI.figureShow();
//            return ActResult.initialize(BeanTransform.copyProperties(bo, OptionVO.class));
            return ActResult.initialize(bo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }
}