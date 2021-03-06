package com.bjike.goddess.staffshares.vo;


/**
 * 公司干股交易情况业务传输对象
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-08-04 08:59 ]
 * @Description: [ 公司干股交易情况业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CompanySchemeVO {

    /**
     * id
     */
    private String id;
    /**
     * 方案代码
     */
    private String code;

    /**
     * 方案名称
     */
    private String name;

    /**
     * 出售/发行人
     */
    private String publisher;

    /**
     * 出售/发行数量
     */
    private Long number;

    /**
     * 出售/发行价格
     */
    private Double price;

    /**
     * 出售/发行时间
     */
    private String time;

    /**
     * 已交易数量
     */
    private Long quantityNum;

    /**
     * 未交易数量
     */
    private Long sharesNum;

    /**
     * 交易收入额
     */
    private Double money;

    /**
     * 状态
     */
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getQuantityNum() {
        return quantityNum;
    }

    public void setQuantityNum(Long quantityNum) {
        this.quantityNum = quantityNum;
    }

    public Long getSharesNum() {
        return sharesNum;
    }

    public void setSharesNum(Long sharesNum) {
        this.sharesNum = sharesNum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}