package com.bjike.goddess.progressmanage.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.progressmanage.bo.NodeListForHeadBO;
import com.bjike.goddess.progressmanage.bo.ProgressNodeBO;
import com.bjike.goddess.progressmanage.dto.ProgressNodeDTO;
import com.bjike.goddess.progressmanage.entity.ProgressNode;
import com.bjike.goddess.progressmanage.entity.ProgressTable;
import com.bjike.goddess.progressmanage.to.ProgressNodeTO;
import com.bjike.goddess.user.api.UserAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 进度节点业务实现
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-06-09 05:21 ]
 * @Description: [ 进度节点业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "progressmanageSerCache")
@Service
public class ProgressNodeSerImpl extends ServiceImpl<ProgressNode, ProgressNodeDTO> implements ProgressNodeSer {

    @Autowired
    private ProgressTableSer progressTableSer;
    @Autowired
    private UserAPI userAPI;

    @Override
    @Transactional(rollbackFor = SerException.class)
    public ProgressNodeBO insertModel(ProgressNodeTO to) throws SerException {
        ProgressTable table = progressTableSer.findById(to.getTableId());
        if (table != null) {

            if ((isExistHeadName(to) != null)) {
                throw new SerException("该进度表已经存在该节点名称，请检查数据!");
            }
            if ((isExistSortIndex(to) != null)) {
                throw new SerException("该进度表已经存在该节点顺序，请检查数据!");
            }
            ProgressNode model = BeanTransform.copyProperties(to, ProgressNode.class, true);
            model.setCreateUser(userAPI.currentUser().getEmployeeNumber());
            model.setProgressTable(table);
            super.save(model);
            return BeanTransform.copyProperties(model, ProgressNodeBO.class);
        } else {
            throw new SerException("非法projectId, 项目对象不存在!");
        }
    }

    public ProgressNode isExistHeadName(ProgressNodeTO to) throws SerException {
        ProgressNodeDTO dto = new ProgressNodeDTO();
        dto.getConditions().add(Restrict.eq("progressTable.id", to.getTableId()));
        dto.getConditions().add(Restrict.eq("nodeName", to.getNodeName()));
        dto.setLimit(1);
        return super.findOne(dto);
    }

    public ProgressNode isExistSortIndex(ProgressNodeTO to) throws SerException {
        ProgressNodeDTO dto = new ProgressNodeDTO();
        dto.getConditions().add(Restrict.eq("progressTable.id", to.getTableId()));
        dto.getConditions().add(Restrict.eq("sortIndex", to.getSortIndex()));
        dto.setLimit(1);
        return super.findOne(dto);
    }


    @Override
    @Transactional(rollbackFor = SerException.class)
    public ProgressNodeBO editModel(ProgressNodeTO to) throws SerException {
        ProgressNode model = super.findById(to.getId());
        if (model != null) {
            ProgressNode judgeName = isExistHeadName(to);
            ProgressNode judgeIndex = isExistSortIndex(to);
            if (judgeName == null || (judgeName != null && to.getId().equals(judgeName.getId()))) {

            } else {
                throw new SerException("该进度表已经存在该节点名称，请检查数据!");
            }
            if (judgeIndex == null || (judgeIndex != null && to.getId().equals(judgeIndex.getId()))) {

            } else {
                throw new SerException("该进度表已经存在该节点顺序，请检查数据!");
            }

            BeanTransform.copyProperties(to, model, true);
            model.setUpdateUser(userAPI.currentUser().getEmployeeNumber());
            model.setModifyTime(LocalDateTime.now());
            super.update(model);
            return BeanTransform.copyProperties(model, ProgressNodeBO.class);

        } else {
            throw new SerException("非法Id,编辑对象不存在!");
        }
    }


    @Override
    @Transactional(rollbackFor = SerException.class)
    public void delete(String id) throws SerException {
        ProgressNode model = super.findById(id);
        if (model != null) {
            super.remove(id);
        } else {
            throw new SerException("非法Id,删除对象不存在!");
        }
    }

    @Override
    public List<ProgressNodeBO> pageList(ProgressNodeDTO dto) throws SerException {
        if (!StringUtils.isEmpty(dto.getTableId())) {
            dto.getSorts().add("sortIndex=asc");
            dto.getConditions().add(Restrict.ne("status", Status.DELETE));
            dto.getConditions().add(Restrict.eq("progressTable.id", dto.getTableId()));
            return BeanTransform.copyProperties(super.findByPage(dto), ProgressNodeBO.class);
        } else {
            throw new SerException("项目Id不能为空!");
        }
    }

    @Override
    public List<NodeListForHeadBO> nodes(String tableId) throws SerException {
        ProgressNodeDTO dto = new ProgressNodeDTO();
        dto.getConditions().add(Restrict.eq("progressTable.id", tableId));
        dto.getSorts().add("sortIndex=asc");
        return BeanTransform.copyProperties(super.findByCis(dto), NodeListForHeadBO.class);
    }
}