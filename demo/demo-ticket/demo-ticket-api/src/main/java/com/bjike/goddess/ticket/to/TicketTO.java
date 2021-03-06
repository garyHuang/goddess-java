package com.bjike.goddess.ticket.to;

import com.bjike.goddess.common.api.to.BaseTO;

import java.time.LocalDateTime;

/**
 * 车票实体
 */

public class TicketTO extends BaseTO {
	private String account;//购买人账号
	/**
	 * 座位号 D3608-2-2D
	 */
	private String position;
	/**
	 * 出发时间
	 */
	private LocalDateTime offTime;
	/**
	 * 购票金额
	 */
	private Integer money;
	/**
	 * 票号
	 */
	private String number;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public LocalDateTime getOffTime() {
		return offTime;
	}

	public void setOffTime(LocalDateTime offTime) {
		this.offTime = offTime;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
