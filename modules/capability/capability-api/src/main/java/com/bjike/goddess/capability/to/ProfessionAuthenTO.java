package com.bjike.goddess.capability.to;

import com.bjike.goddess.common.api.to.BaseTO;
/**
* 专业资质认证
* @Author:			[ zhuangkaiqin ]
* @Date:			[  2017-06-16 06:06 ]
* @Description:	[ 专业资质认证 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class ProfessionAuthenTO extends BaseTO { 

/**
* 主表Id
*/
 private String  baseId; 

/**
* 名字
*/
 private String  name; 



 public String getBaseId () { 
 return baseId;
 } 
 public void setBaseId (String baseId ) { 
 this.baseId = baseId ; 
 } 
 public String getName () { 
 return name;
 } 
 public void setName (String name ) { 
 this.name = name ; 
 } 
 }