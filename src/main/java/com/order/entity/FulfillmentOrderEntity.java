package com.order.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.order.dto.Source;
import com.order.dto.BillingAddress;
import com.order.dto.OrderTotals;

@Entity
@Table(name = "FulfillmentOrderEntity")
public class FulfillmentOrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name = "orderID")
	public String orderID;
	@Column(name = "orderTypeCode")
	public String orderTypeCode;
	@Column(name = "partnerOrderID")
	public String partnerOrderID;
	@Column(name = "orderStatus")
	public String orderStatus;
	@Column(name = "messageCreateTimeStamp")
	public String messageCreateTimeStamp;
	@Column(name = "fulfillmentChannelCode")
	public String fulfillmentChannelCode;
	@Column(name = "orderStatusCode")
	public String orderStatusCode;
	@Column(name = "orderStatusDescription")
	public String orderStatusDescription;
	@Column(name = "sellZLDivisionNbr")
	public String sellZLDivisionNbr;
	@Column(name = "sellZLLocationNbr")
	public String sellZLLocationNbr;
	//@Column(name = "source")
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="source_id")
	public SourceEntity source;
	//@Column(name = "orderTotals")
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="order_id")
	public OrderTotalsEntity orderTotals;
	//@Column(name = "billingAddress")
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="billing_id")
	public BillingAddressEntity billingAddress;

	@Override
	public String toString() {
		return "FulfillmentOrderEntity {id=" + id + ", orderID=" + orderID + ", orderTypeCode=" + orderTypeCode
				+ ", partnerOrderID=" + partnerOrderID + ", orderStatus=" + orderStatus + ", messageCreateTimeStamp="
				+ messageCreateTimeStamp + ", fulfillmentChannelCode=" + fulfillmentChannelCode + ", orderStatusCode="
				+ orderStatusCode + ", orderStatusDescription=" + orderStatusDescription + ", sellZLDivisionNbr="
				+ sellZLDivisionNbr + ", sellZLLocationNbr=" + sellZLLocationNbr + ", source=" + source
				+ ", orderTotals=" + orderTotals + ", billingAddress=" + billingAddress + "}";
	}
	
//	@Override
//	public String toString() {
//		return "FulfillmentOrderEntity {id=" + id + ", orderID=" + orderID + ", orderTypeCode=" + orderTypeCode
//				+ ", partnerOrderID=" + partnerOrderID + ", orderStatus=" + orderStatus + ", messageCreateTimeStamp="
//				+ messageCreateTimeStamp + ", fulfillmentChannelCode=" + fulfillmentChannelCode + ", orderStatusCode="
//				+ orderStatusCode + ", orderStatusDescription=" + orderStatusDescription + ", sellZLDivisionNbr="
//				+ sellZLDivisionNbr + ", sellZLLocationNbr=" + sellZLLocationNbr + ", source=" + source
//				+ ", orderTotals=" + orderTotals + "}";
//	}

	public FulfillmentOrderEntity(int id, String orderID, String orderTypeCode, String partnerOrderID,
			String orderStatus, String messageCreateTimeStamp, String fulfillmentChannelCode, String orderStatusCode,
			String orderStatusDescription, String sellZLDivisionNbr, String sellZLLocationNbr, SourceEntity source,
			OrderTotalsEntity orderTotals, BillingAddressEntity billingAddress) {
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

	public FulfillmentOrderEntity() {
		super();
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

	public SourceEntity getSource() {
		return source;
	}

	public void setSource(SourceEntity source) {
		this.source = source;
	}

	public OrderTotalsEntity getOrderTotals() {
		return orderTotals;
	}

	public void setOrderTotals(OrderTotalsEntity orderTotals) {
		this.orderTotals = orderTotals;
	}

	public BillingAddressEntity getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddressEntity billingAddress) {
		this.billingAddress = billingAddress;
	}

}
