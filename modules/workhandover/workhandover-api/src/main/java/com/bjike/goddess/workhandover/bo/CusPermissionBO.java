package com.bjike.goddess.workhandover.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.workhandover.enums.CusPermissionType;

import javax.persistence.Column;
/**
* 权限配置业务传输对象
* @Author:			[ chenyang ]
* @Date:			[  2017-11-14 09:33 ]
* @Description:	[ 权限配置业务传输对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CusPermissionBO extends BaseBO { 

/**
* 辅助id
*/
 private String  idFlag; 

/**
* 描述
*/
 private String  description; 

/**
* 操作对象
*/
 private String  operator; 

/**
* 类型
*/
 private CusPermissionType type;



 public String getIdFlag () { 
 return idFlag;
 } 
 public void setIdFlag (String idFlag ) { 
 this.idFlag = idFlag ; 
 } 
 public String getDescription () { 
 return description;
 } 
 public void setDescription (String description ) { 
 this.description = description ; 
 } 
 public String getOperator () { 
 return operator;
 } 
 public void setOperator (String operator ) { 
 this.operator = operator ; 
 } 
 public CusPermissionType getType () { 
 return type;
 } 
 public void setType (CusPermissionType type ) { 
 this.type = type ; 
 } 
 }