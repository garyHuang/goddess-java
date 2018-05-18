package com.bjike.goddess.shareholdersmanage.excel;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.common.utils.excel.ExcelHeader;
import com.bjike.goddess.shareholdersmanage.type.Gender;
import com.bjike.goddess.shareholdersmanage.type.TypeName;

/**
 * 股东开户业务传输对象
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-08-18 02:41 ]
 * @Description: [ 股东开户业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ShareRosterExport extends BaseBO {

    /**
     * 地区
     */
    @ExcelHeader(name = "地区",notNull = true)
    private String area;

    /**
     * 类型名称
     */
    @ExcelHeader(name = "类型名称",notNull = true)
    private String typeName;

    /**
     * 股东姓名
     */
    @ExcelHeader(name = "股东姓名",notNull = true)
    private String shareholderName;

    /**
     * 性别
     */
    @ExcelHeader(name = "性别",notNull = true)
    private String gender;

    /**
     * 证件类型
     */
    @ExcelHeader(name = "证件类型",notNull = true)
    private String documentType;

    /**
     * 证件号码
     */
    @ExcelHeader(name = "证件号码",notNull = true)
    private String certifiID;

    /**
     * 联系住址
     */
    @ExcelHeader(name = "联系住址",notNull = true)
    private String contactAddress;

    /**
     * 联系电话
     */
    @ExcelHeader(name = "联系电话",notNull = true)
    private String contactNum;

    /**
     * 持股数量
     */
    @ExcelHeader(name = "持股数量",notNull = true)
    private Integer holdNum;

    /**
     * 每股价格/元
     */
    @ExcelHeader(name = "每股价格/元",notNull = true)
    private Double perSharePrice;

    /**
     * 出资额
     */
    @ExcelHeader(name = "出资额",notNull = true)
    private Double amount;

    /**
     * 出资方式
     */
    @ExcelHeader(name = "出资方式",notNull = true)
    private String capitalWay;

    /**
     * 出资日期
     */
    @ExcelHeader(name = "出资日期",notNull = true)
    private String openDate;

    /**
     * 股权类型
     */
    @ExcelHeader(name = "股权类型",notNull = true)
    private String equityType;

    /**
     * 占股比例
     */
    @ExcelHeader(name = "占股比例",notNull = true)
    private Double percentage;


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getCertifiID() {
        return certifiID;
    }

    public void setCertifiID(String certifiID) {
        this.certifiID = certifiID;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public Integer getHoldNum() {
        return holdNum;
    }

    public void setHoldNum(Integer holdNum) {
        this.holdNum = holdNum;
    }

    public Double getPerSharePrice() {
        return perSharePrice;
    }

    public void setPerSharePrice(Double perSharePrice) {
        this.perSharePrice = perSharePrice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCapitalWay() {
        return capitalWay;
    }

    public void setCapitalWay(String capitalWay) {
        this.capitalWay = capitalWay;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getEquityType() {
        return equityType;
    }

    public void setEquityType(String equityType) {
        this.equityType = equityType;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}