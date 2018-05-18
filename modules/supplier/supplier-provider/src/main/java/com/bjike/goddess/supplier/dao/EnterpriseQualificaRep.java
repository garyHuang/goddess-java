package com.bjike.goddess.supplier.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.supplier.dto.EnterpriseQualificaDTO;
import com.bjike.goddess.supplier.entity.EnterpriseQualifica;

/**
* 企业资质持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ lijuntao ]
* @Date:			[  2017-12-15 03:58 ]
* @Description:	[ 企业资质持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface EnterpriseQualificaRep extends JpaRep<EnterpriseQualifica ,EnterpriseQualificaDTO> { 

 }