package com.bjike.goddess.materialbuy.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.materialbuy.dto.BankMonthDTO;
import com.bjike.goddess.materialbuy.entity.BankMonth;

/**
* 银行流水持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ yangruizhen ]
* @Date:			[  2018-04-07 04:29 ]
* @Description:	[ 银行流水持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface BankMonthRep extends JpaRep<BankMonth ,BankMonthDTO> { 

 }