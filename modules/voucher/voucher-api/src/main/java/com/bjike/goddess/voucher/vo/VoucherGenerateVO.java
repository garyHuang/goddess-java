package com.bjike.goddess.voucher.vo;

import com.bjike.goddess.voucher.bo.VoucherGenerateBO;
import com.bjike.goddess.voucher.enums.AuditStatus;
import com.bjike.goddess.voucher.enums.CheckStatus;
import com.bjike.goddess.voucher.enums.TransferStatus;

import java.util.List;

/**
 * 记账凭证生成表现层对象
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-17 05:33 ]
 * @Description: [ 记账凭证生成表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class VoucherGenerateVO {

    /**
     * id
     */
    private String id;
    /**
     * 凭证字
     */
    private String voucherWord;

    /**
     * 凭证字号
     */
    private Double voucherNum;

    /**
     * 凭证日期
     */
    private String voucherDate;

    /**
     * 一级科目
     */
    private String firstSubject;

    /**
     * 二级科目
     */
    private String secondSubject;

    /**
     * 三级科目
     */
    private String thirdSubject;

    /**
     * 借方金额
     */
    private Double borrowMoney;

    /**
     * 贷方金额
     */
    private Double loanMoney;

    /**
     * 借方金额合计
     */
    private Double borrowMoneyTotal;

    /**
     * 贷方金额合计
     */
    private Double loanMoneyTotal;


    /**
     * 摘要
     */
    private String sumary;

    /**
     * 来源
     */
    private String source;

    /**
     * 地区
     */
    private String area;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目组
     */
    private String projectGroup;

    /**
     * 制单人
     */
    private String ticketer;

    /**
     * 票据数量
     */
    private Double ticketNum;

    /**
     * 附件
     */
    private String extraFile;

    /**
     * 审核人
     */
    private String auditor;

    /**
     * 审核状态
     */
    private AuditStatus auditStatus;

    /**
     * 过帐状态
     */
    private TransferStatus transferStatus;

    /**
     * 结帐状态
     */
    private CheckStatus checkStatus;

    /**
     * 借贷金额合计
     */
    private Double moneyTotal;

    /**
     * 合计id
     */
    private String totalId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


    /**
     * 一级科目
     */
    private List<String> firstSubjects;

    /**
     * 二级科目
     */
    private List<String> secondSubjects;

    /**
     * 三级科目
     */
    private List<String> thirdSubjects;

    /**
     * 借方金额且数据与贷方金额相反填如1-10
     */
    private List<Double> borrowMoneys;

    /**
     * 贷方金额且数据与借方金额相反填如0-1
     */
    private List<Double> loanMoneys;

    /**
     *　凭证标志
     */
    private String uId;

    /**
     * 子凭证
     */
    private List<VoucherGenerateChildVO> details;


    /*
     * 凭证字号”和“凭证字”合并成“凭证字号”字段
     */
    private String newVoucherNum;

    /**
     * 类别
     */
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNewVoucherNum() {
        return newVoucherNum;
    }

    public void setNewVoucherNum(String newVoucherNum) {
        this.newVoucherNum = newVoucherNum;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoucherWord() {
        return voucherWord;
    }

    public void setVoucherWord(String voucherWord) {
        this.voucherWord = voucherWord;
    }

    public Double getVoucherNum() {
        return voucherNum;
    }

    public void setVoucherNum(Double voucherNum) {
        this.voucherNum = voucherNum;
    }

    public String getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(String voucherDate) {
        this.voucherDate = voucherDate;
    }

    public String getFirstSubject() {
        return firstSubject;
    }

    public void setFirstSubject(String firstSubject) {
        this.firstSubject = firstSubject;
    }

    public String getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(String secondSubject) {
        this.secondSubject = secondSubject;
    }

    public String getThirdSubject() {
        return thirdSubject;
    }

    public void setThirdSubject(String thirdSubject) {
        this.thirdSubject = thirdSubject;
    }

    public Double getBorrowMoney() {
        return borrowMoney;
    }

    public void setBorrowMoney(Double borrowMoney) {
        this.borrowMoney = borrowMoney;
    }

    public Double getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(Double loanMoney) {
        this.loanMoney = loanMoney;
    }

    public String getSumary() {
        return sumary;
    }

    public void setSumary(String sumary) {
        this.sumary = sumary;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getTicketer() {
        return ticketer;
    }

    public void setTicketer(String ticketer) {
        this.ticketer = ticketer;
    }

    public Double getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Double ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getExtraFile() {
        return extraFile;
    }

    public void setExtraFile(String extraFile) {
        this.extraFile = extraFile;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public AuditStatus getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(AuditStatus auditStatus) {
        this.auditStatus = auditStatus;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }

    public CheckStatus getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(CheckStatus checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Double getMoneyTotal() {
        return moneyTotal;
    }

    public void setMoneyTotal(Double moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public String getTotalId() {
        return totalId;
    }

    public void setTotalId(String totalId) {
        this.totalId = totalId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public List<String> getFirstSubjects() {
        return firstSubjects;
    }

    public void setFirstSubjects(List<String> firstSubjects) {
        this.firstSubjects = firstSubjects;
    }

    public List<String> getSecondSubjects() {
        return secondSubjects;
    }

    public void setSecondSubjects(List<String> secondSubjects) {
        this.secondSubjects = secondSubjects;
    }

    public List<String> getThirdSubjects() {
        return thirdSubjects;
    }

    public void setThirdSubjects(List<String> thirdSubjects) {
        this.thirdSubjects = thirdSubjects;
    }

    public List<Double> getBorrowMoneys() {
        return borrowMoneys;
    }

    public void setBorrowMoneys(List<Double> borrowMoneys) {
        this.borrowMoneys = borrowMoneys;
    }

    public List<Double> getLoanMoneys() {
        return loanMoneys;
    }

    public void setLoanMoneys(List<Double> loanMoneys) {
        this.loanMoneys = loanMoneys;
    }

    public Double getBorrowMoneyTotal() {
        return borrowMoneyTotal;
    }

    public void setBorrowMoneyTotal(Double borrowMoneyTotal) {
        this.borrowMoneyTotal = borrowMoneyTotal;
    }

    public Double getLoanMoneyTotal() {
        return loanMoneyTotal;
    }

    public void setLoanMoneyTotal(Double loanMoneyTotal) {
        this.loanMoneyTotal = loanMoneyTotal;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public List<VoucherGenerateChildVO> getDetails() {
        return details;
    }

    public void setDetails(List<VoucherGenerateChildVO> details) {
        this.details = details;
    }
}