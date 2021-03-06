package com.bjike.goddess.coststandard.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.provider.utils.RpcTransmit;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.coststandard.bo.CostStandardContrastBO;
import com.bjike.goddess.coststandard.dto.CostStandardContrastDTO;
import com.bjike.goddess.coststandard.entity.CostStandardContrast;
import com.bjike.goddess.coststandard.enums.GuideAddrStatus;
import com.bjike.goddess.coststandard.excel.SonPermissionObject;
import com.bjike.goddess.coststandard.to.CostStandardContrastTO;
import com.bjike.goddess.coststandard.to.GuidePermissionTO;
import com.bjike.goddess.user.api.UserAPI;
import com.bjike.goddess.user.bo.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 费用标准对比业务实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-05-24 11:15 ]
 * @Description: [ 费用标准对比业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "coststandardSerCache")
@Service
public class CostStandardContrastSerImpl extends ServiceImpl<CostStandardContrast, CostStandardContrastDTO> implements CostStandardContrastSer {

    @Autowired
    private CostStandardSer costStandardSer;
    @Autowired
    private UserAPI userAPI;
    @Autowired
    private CusPermissionSer cusPermissionSer;

    private CostStandardContrastBO transformBO(CostStandardContrast entity) throws SerException {
        CostStandardContrastBO bo = BeanTransform.copyProperties(entity, CostStandardContrastBO.class);
        BeanTransform.copyProperties(entity.getStandard(), bo, true);
        bo.setId(entity.getId());
        bo.setStandardId(entity.getStandard().getId());
        bo.setStandardName(entity.getStandard().getStandard());
        return bo;
    }

    private List<CostStandardContrastBO> transformBOList(List<CostStandardContrast> list) throws SerException {
        List<CostStandardContrastBO> bos = new ArrayList<>(0);
        for (CostStandardContrast entity : list)
            bos.add(this.transformBO(entity));
        return bos;
    }

    @Override
    public CostStandardContrastBO save(CostStandardContrastTO to) throws SerException {
        CostStandardContrast entity = BeanTransform.copyProperties(to, CostStandardContrast.class);
        entity.setStandard(costStandardSer.findById(to.getStandardId()));
        if (null == entity.getStandard())
            throw new SerException("该标准不存在,无法保存");
        super.save(entity);
        return this.transformBO(entity);
    }

    @Override
    public CostStandardContrastBO update(CostStandardContrastTO to) throws SerException {
        CostStandardContrast entity = super.findById(to.getId());
        if (null == entity)
            throw new SerException("数据不存在");
        BeanTransform.copyProperties(to, entity, true);
        entity.setModifyTime(LocalDateTime.now());
        entity.setStandard(costStandardSer.findById(to.getStandardId()));
        if (null == entity.getStandard())
            throw new SerException("该标准不存在,无法保存");
        super.update(entity);
        return this.transformBO(entity);
    }

    @Override
    public CostStandardContrastBO delete(String id) throws SerException {
        CostStandardContrast entity = super.findById(id);
        if (null == entity)
            throw new SerException("数据不存在");
        super.remove(entity);
        return this.transformBO(entity);
    }

    @Override
    public CostStandardContrastBO getById(String id) throws SerException {
        CostStandardContrast entity = super.findById(id);
        if (null == entity)
            throw new SerException("数据不存在");
        return this.transformBO(entity);
    }

    @Override
    public List<CostStandardContrastBO> maps(CostStandardContrastDTO dto) throws SerException {
        dto.getSorts().add("createTime=desc");
        return this.transformBOList(super.findByPage(dto));
    }

    @Override
    public Long getTotal() throws SerException {
        CostStandardContrastDTO dto = new CostStandardContrastDTO();
        return super.count(dto);
    }


    @Override
    public Boolean sonPermission() throws SerException {
        String userToken = RpcTransmit.getUserToken();
        Boolean flagSee = guideSeeIdentity();
        RpcTransmit.transmitUserToken(userToken);
        Boolean flagAdd = guideAddIdentity();
        if( flagSee || flagAdd ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        String userToken = RpcTransmit.getUserToken();
        GuideAddrStatus guideAddrStatus = guidePermissionTO.getGuideAddrStatus();
        Boolean flag = true;
        switch (guideAddrStatus) {
            case LIST:
                flag = guideSeeIdentity();
                break;
            case ADD:
                flag = guideAddIdentity();
                break;
            case EDIT:
                flag = guideAddIdentity();
                break;
            case AUDIT:
                flag = guideAddIdentity();
                break;
            case DELETE:
                flag = guideAddIdentity();
                break;
            case CONGEL:
                flag = guideAddIdentity();
                break;
            case THAW:
                flag = guideAddIdentity();
                break;
            case COLLECT:
                flag = guideAddIdentity();
                break;
            case IMPORT:
                flag = guideAddIdentity();
                break;
            case EXPORT:
                flag = guideAddIdentity();
                break;
            case UPLOAD:
                flag = guideAddIdentity();
                break;
            case DOWNLOAD:
                flag = guideAddIdentity();
                break;
            case SEE:
                flag = guideSeeIdentity();
                break;
            case SEEFILE:
                flag = guideSeeIdentity();
                break;
            default:
                flag = true;
                break;
        }
        return flag;
    }

    /**
     * 导航栏核对查看权限（部门级别）
     */
    private Boolean guideSeeIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.getCusPermission("1");
        } else {
            flag = true;
        }
        return flag;
    }

    /**
     * 导航栏核对添加修改删除审核权限（岗位级别）
     */
    private Boolean guideAddIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.busCusPermission("2");
        } else {
            flag = true;
        }
        return flag;
    }
}