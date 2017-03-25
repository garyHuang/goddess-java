package com.bjike.goddess.marketactivitymanage.action.marketactivitymanage;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.marketactivitymanage.api.MarketServeSummaryAPI;
import com.bjike.goddess.marketactivitymanage.bo.MarketServeSummaryBO;
import com.bjike.goddess.marketactivitymanage.bo.ServeSummaryBO;
import com.bjike.goddess.marketactivitymanage.dto.MarketServeSummaryDTO;
import com.bjike.goddess.marketactivitymanage.to.MarketServeSummaryTO;
import com.bjike.goddess.marketactivitymanage.vo.MarketServeSummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 市场招待汇总
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-03-21 02:19 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("marketactivitymanage/marketservesummary")
public class MarketServeSummaryAct {

    @Autowired
    private MarketServeSummaryAPI marketServeSummaryAPI;

    /**
     * 分页查询市场招待邮件
     *
     * @param dto 市场招待邮箱发送传输对象
     * @return class MarketServeSummaryVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(MarketServeSummaryDTO dto) throws ActException {
        try {
            List<MarketServeSummaryBO> boList = marketServeSummaryAPI.list(dto);
            List<MarketServeSummaryVO> voList = BeanTransform.copyProperties(boList, MarketServeSummaryVO.class);
            return ActResult.initialize(voList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 添加市场招待邮件发送
     *
     * @param to 市场招待邮件发送to信息
     * @return class MarketServeSummaryVO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/add")
    public Result add(@Validated({ADD.class}) MarketServeSummaryTO to) throws ActException {
        try {
            MarketServeSummaryBO bo = marketServeSummaryAPI.save(to);
            MarketServeSummaryVO vo = BeanTransform.copyProperties(bo, MarketServeSummaryVO.class);
            return ActResult.initialize(vo);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除市场招待邮件发送
     *
     * @param id 市场招待邮件发送唯一标识
     * @throws ActException
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            marketServeSummaryAPI.remove(id);
            return new ActResult("delete success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑市场招待邮件发送
     *
     * @param to 市场招待邮件发送to信息
     * @throws ActException
     * @version v1
     */
    @PutMapping("v1/edit")
    public Result edit(@Validated({EDIT.class}) MarketServeSummaryTO to) throws ActException {
        try {
            marketServeSummaryAPI.update(to);
            return new ActResult("edit success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 解冻市场招待邮件发送
     *
     * @param to 市场招待邮件发送to信息
     * @throws ActException
     * @version v1
     */
    @PutMapping("v1/thaw")
    public Result thaw(@Validated({EDIT.class}) MarketServeSummaryTO to) throws ActException {
        try {
            marketServeSummaryAPI.thaw(to);
            return new ActResult("thaw success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑市场招待邮件发送
     *
     * @param to 市场招待邮件发送to信息
     * @throws ActException
     * @version v1
     */
    @PutMapping("v1/congeal")
    public Result congeal(@Validated({EDIT.class}) MarketServeSummaryTO to) throws ActException {
        try {
            marketServeSummaryAPI.congeal(to);
            return new ActResult("congeal success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 市场招待汇总
     *
     * @param to 市场招待邮件发送to信息
     * @return class MarketServeSummaryVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/summarize")
    public Result summarize(MarketServeSummaryTO to) throws ActException {
        try {
            List<ServeSummaryBO> boList = marketServeSummaryAPI.summarize(to);
            List<MarketServeSummaryVO> voList = BeanTransform.copyProperties(boList, MarketServeSummaryVO.class);
            return ActResult.initialize(voList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}