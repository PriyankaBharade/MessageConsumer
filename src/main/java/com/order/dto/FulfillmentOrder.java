package com.order.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Full Order Model")
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "FulfillmentOrder")
public class FulfillmentOrder {// implements Serializable
	@ApiModelProperty("unique id")
	int id;
	// @JacksonXmlProperty(localName = "orderID")
	@ApiModelProperty("Order Id")
	public String orderID;
	// @JacksonXmlProperty(localName = "orderTypeCode")
	@ApiModelProperty("Order Type Code")
	public String orderTypeCode;
	// @JacksonXmlProperty(localName = "partnerOrderID")
	@ApiModelProperty("Partner Order Id")
	public String partnerOrderID;
	// @JacksonXmlProperty(localName = "orderStatus")
	@ApiModelProperty("Order Status")
	public String orderStatus;
	// @JacksonXmlProperty(localName = "messageCreateTimeStamp")
	@ApiModelProperty("Order generated time")
	public String messageCreateTimeStamp;
	// @JacksonXmlProperty(localName = "fulfillmentChannelCode")
	@ApiModelProperty("Full Order Channel Code")
	public String fulfillmentChannelCode;
	// @JacksonXmlProperty(localName = "fulfillmentChannelCode")
	@ApiModelProperty("Order Status Code")
	public String orderStatusCode;
	// @JacksonXmlProperty(localName = "orderStatusDescription")
	@ApiModelProperty("Order Status Description")
	public String orderStatusDescription;
	// @JacksonXmlProperty(localName = "sellZLDivisionNbr")
	@ApiModelProperty("Sell Dividion Number")
	public String sellZLDivisionNbr;
	// @JacksonXmlProperty(localName = "sellZLLocationNbr")
	@ApiModelProperty("Sell Location Number")
	public String sellZLLocationNbr;
	// @JacksonXmlProperty(localName = "source")
	@ApiModelProperty("Source")
	public Source source;
	// @JacksonXmlProperty(localName = "source")
	@ApiModelProperty("Total Orders")
	public OrderTotals orderTotals;
	// @JacksonXmlProperty(localName = "billingAddress")
	@ApiModelProperty("Billing Address")
	public BillingAddress billingAddress;

	public FulfillmentOrder() {
		super();
	}

	@Override
	public String toString() {
		return "FulfillmentOrder {id=" + id + ", orderID=" + orderID + ", orderTypeCode=" + orderTypeCode
				+ ", partnerOrderID=" + partnerOrderID + ", orderStatus=" + orderStatus + ", messageCreateTimeStamp="
				+ messageCreateTimeStamp + ", fulfillmentChannelCode=" + fulfillmentChannelCode + ", orderStatusCode="
				+ orderStatusCode + ", orderStatusDescription=" + orderStatusDescription + ", sellZLDivisionNbr="
				+ sellZLDivisionNbr + ", sellZLLocationNbr=" + sellZLLocationNbr + ", source=" + source
				+ ", orderTotals=" + orderTotals + ", billingAddress=" + billingAddress + "}";
	}

	public FulfillmentOrder(int id, String orderID, String orderTypeCode, String partnerOrderID, String orderStatus,
			String messageCreateTimeStamp, String fulfillmentChannelCode, String orderStatusCode,
			String orderStatusDescription, String sellZLDivisionNbr, String sellZLLocationNbr, Source source,
			OrderTotals orderTotals, BillingAddress billingAddress) {
		super();
		this.id = id;
		this.orderID = orderID;
		this.orderTypeCode = orderTypeCode;
		this.partnerOrderID = partnerOrderID;
		this.orderStatus = orderStatus;
		this.messageCreateTimeStamp = messageCreateTimeStamp;
		this.fulfillmentChannelCode = fulfillmentChannelCode;
		this.orderStatusCode = orderStatusCode;
		this.orderStatusDescription = orderStatusDescription;
		this.sellZLDivisionNbr = sellZLDivisionNbr;
		this.sellZLLocationNbr = sellZLLocationNbr;
		this.source = source;
		this.orderTotals = orderTotals;
		this.billingAddress = billingAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public String getPartnerOrderID() {
		return partnerOrderID;
	}

	public void setPartnerOrderID(String partnerOrderID) {
		this.partnerOrderID = partnerOrderID;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getMessageCreateTimeStamp() {
		return messageCreateTimeStamp;
	}

	public void setMessageCreateTimeStamp(String messageCreateTimeStamp) {
		this.messageCreateTimeStamp = messageCreateTimeStamp;
	}

	public String getFulfillmentChannelCode() {
		return fulfillmentChannelCode;
	}

	public void setFulfillmentChannelCode(String fulfillmentChannelCode) {
		this.fulfillmentChannelCode = fulfillmentChannelCode;
	}

	public String getOrderStatusCode() {
		return orderStatusCode;
	}

	public void setOrderStatusCode(String orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}

	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}

	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}

	public String getSellZLDivisionNbr() {
		return sellZLDivisionNbr;
	}

	public void setSellZLDivisionNbr(String sellZLDivisionNbr) {
		this.sellZLDivisionNbr = sellZLDivisionNbr;
	}

	public String getSellZLLocationNbr() {
		return sellZLLocationNbr;
	}

	public void setSellZLLocationNbr(String sellZLLocationNbr) {
		this.sellZLLocationNbr = sellZLLocationNbr;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public OrderTotals getOrderTotals() {
		return orderTotals;
	}

	public void setOrderTotals(OrderTotals orderTotals) {
		this.orderTotals = orderTotals;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

}
