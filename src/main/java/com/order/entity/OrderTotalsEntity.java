package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderTotalsEntity")
public class OrderTotalsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name = "totalPurchaseAmount")
	public String totalPurchaseAmount;
	@Column(name = "seperatorOrderTotals0")
	public String seperatorOrderTotals0;
	
	@Override
	public String toString() {
		return "OrderTotalsEntity {id=" + id + ", totalPurchaseAmount=" + totalPurchaseAmount
				+ ", seperatorOrderTotals0=" + seperatorOrderTotals0 + "}";
	}

	public OrderTotalsEntity() {
		super();
	}


	public OrderTotalsEntity(int id, String totalPurchaseAmount, String seperatorOrderTotals0) {
		super();
		this.id = id;
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTotalPurchaseAmount() {
		return totalPurchaseAmount;
	}
	public void setTotalPurchaseAmount(String totalPurchaseAmount) {
		this.totalPurchaseAmount = totalPurchaseAmount;
	}
	public String getSeperatorOrderTotals0() {
		return seperatorOrderTotals0;
	}
	public void setSeperatorOrderTotals0(String seperatorOrderTotals0) {
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}
	
	
	
}
