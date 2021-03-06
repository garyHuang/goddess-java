package com.bjike.goddess.abilitydisplay.vo;

import com.bjike.goddess.abilitydisplay.entity.ComCertificate;

/**
* 公司认证表现层对象
* @Author:			[ wanyi ]
* @Date:			[  2018-01-08 05:31 ]
* @Description:	[ 公司认证表现层对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CompanyAuthVO { 

/**
* id
*/
 private String  id; 
/**
* 中兴技能认证证书数量
*/
 private Integer  zteNum; 

/**
* 华为技能认证证书数量
*/
 private Integer  huaweiNum; 

/**
* 公司证书
*/
 private ComCertificate certificate;



 public String getId () { 
 return id;
 } 
 public void setId (String id ) { 
 this.id = id ; 
 } 
 public Integer getZteNum () { 
 return zteNum;
 } 
 public void setZteNum (Integer zteNum ) { 
 this.zteNum = zteNum ; 
 } 
 public Integer getHuaweiNum () { 
 return huaweiNum;
 } 
 public void setHuaweiNum (Integer huaweiNum ) { 
 this.huaweiNum = huaweiNum ; 
 } 
 public ComCertificate getCertificate () { 
 return certificate;
 } 
 public void setCertificate (ComCertificate certificate ) { 
 this.certificate = certificate ; 
 } 
 }