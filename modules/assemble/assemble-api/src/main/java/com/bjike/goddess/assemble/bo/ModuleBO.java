package com.bjike.goddess.assemble.bo;

import com.bjike.goddess.assemble.type.CheckType;
import com.bjike.goddess.common.api.bo.BaseBO;

import java.util.List;

/**
 * 模块
 *
 * @Author: [liguiqin]
 * @Date: [2017-03-03 10:20]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class ModuleBO extends BaseBO {
    /**
     * 模块名称
     */
    private String name;

    /**
     * 模块英文名
     */
    private String moduleName;

    private Integer seq;

    /**
     * 选中状态
     */
    private CheckType checkType = CheckType.NONE;
    /**
     * 包含的模块
     */
    private List<ModuleBO> relations;

    /**
     * 关联id
     */
    private String relationId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckType getCheckType() {
        return checkType;
    }

    public void setCheckType(CheckType checkType) {
        this.checkType = checkType;
    }

    public List<ModuleBO> getRelations() {
        return relations;
    }

    public void setRelations(List<ModuleBO> relations) {
        this.relations = relations;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
