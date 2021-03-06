package com.bjike.goddess.contacts.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.contacts.bo.OtherContactsBO;
import com.bjike.goddess.contacts.dto.OtherContactsDTO;
import com.bjike.goddess.contacts.service.OtherContactsSer;
import com.bjike.goddess.contacts.to.GuidePermissionTO;
import com.bjike.goddess.contacts.to.OtherContactsTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 其他通讯录业务接口实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-29 05:44 ]
 * @Description: [ 其他通讯录业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("otherContactsApiImpl")
public class OtherContactsApiImpl implements OtherContactsAPI {

    @Autowired
    private OtherContactsSer otherContactsSer;

    @Override
    public OtherContactsBO save(OtherContactsTO to) throws SerException {
        return otherContactsSer.save(to);
    }

    @Override
    public OtherContactsBO update(OtherContactsTO to) throws SerException {
        return otherContactsSer.update(to);
    }

    @Override
    public OtherContactsBO delete(OtherContactsTO to) throws SerException {
        return otherContactsSer.delete(to);
    }

    @Override
    public List<OtherContactsBO> maps(OtherContactsDTO dto) throws SerException {
        return otherContactsSer.maps(dto);
    }

    @Override
    public OtherContactsBO getById(String id) throws SerException {
        return otherContactsSer.getById(id);
    }

    @Override
    public Long getTotal() throws SerException {
        return otherContactsSer.getTotal();
    }

    @Override
    public Boolean sonPermission() throws SerException {
        return otherContactsSer.sonPermission();
    }

    @Override
    public Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return otherContactsSer.guidePermission(guidePermissionTO);
    }

    @Override
    public OtherContactsBO importExcel(List<OtherContactsTO> tocs) throws SerException {
        return otherContactsSer.importExcel(tocs);
    }

    @Override
    public byte[] templateExport() throws SerException {
        return otherContactsSer.templateExport();
    }
}