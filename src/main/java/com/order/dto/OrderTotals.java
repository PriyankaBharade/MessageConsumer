package com.order.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Total Order Model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderTotals {// implements Serializable
	@ApiModelProperty("unique id")
	int id;
	// @JacksonXmlProperty(localName = "totalPurchaseAmount")
	@ApiModelProperty("Total Purchase Amount")
	public String totalPurchaseAmount;
	// @JacksonXmlProperty(localName = "seperatorOrderTotals0")
	@ApiModelProperty("Seperate Order Total")
	public String seperatorOrderTotals0;

	@Override
	public String toString() {
		return "OrderTotals [id=" + id + ", totalPurchaseAmount=" + totalPurchaseAmount + ", seperatorOrderTotals0="
				+ seperatorOrderTotals0 + "]";
	}

	public OrderTotals() {
		super();
	}

	public OrderTotals(int id, String totalPurchaseAmount, String seperatorOrderTotals0) {
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
