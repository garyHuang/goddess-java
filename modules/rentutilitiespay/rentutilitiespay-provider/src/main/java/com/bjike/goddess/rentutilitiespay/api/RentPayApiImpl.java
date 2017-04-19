package com.bjike.goddess.rentutilitiespay.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.rentutilitiespay.bo.RentPayBO;
import com.bjike.goddess.rentutilitiespay.dto.RentPayDTO;
import com.bjike.goddess.rentutilitiespay.entity.RentPay;
import com.bjike.goddess.rentutilitiespay.service.RentPaySer;
import com.bjike.goddess.rentutilitiespay.to.RentPayTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 房租缴费业务接口实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-13 07:10 ]
 * @Description: [ 房租缴费业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("rentPayApiImpl")
public class RentPayApiImpl implements RentPayAPI {
    @Autowired
    private RentPaySer rentPaySer;
    @Override
    public List<RentPayBO> findListRentPay(RentPayDTO rentPayDTO) throws SerException {
        return rentPaySer.findListRentPay(rentPayDTO);
    }

    @Override
    public RentPayBO insertRentPay(RentPayTO rentPayTO) throws SerException {
        return rentPaySer.insertRentPay(rentPayTO);
    }

    @Override
    public RentPayBO editRentPay(RentPayTO rentPayTO) throws SerException {
        return rentPaySer.editRentPay(rentPayTO);
    }

    @Override
    public void removeRentPay(String id) throws SerException {
        rentPaySer.removeRentPay(id);
    }
    @Override
    public void uploadAttachments() throws SerException {
        rentPaySer.uploadAttachments();
    }
    @Override
    public List<RentPayBO> collectArea(String[] area) throws SerException {
        return rentPaySer.collectArea(area);
    }

}