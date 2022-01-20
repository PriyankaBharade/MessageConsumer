package com.order.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Source Model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Source {// implements Serializable
	@ApiModelProperty("unique id")
	int id;
	// @JacksonXmlProperty(localName = "clientID")
	@ApiModelProperty("Client Id")
	public String clientID;
	// @JacksonXmlProperty(localName = "subClientID")
	@ApiModelProperty("Sub Client Id")
	public String subClientID;
	// @JacksonXmlProperty(localName = "sellingChannelCode")
	@ApiModelProperty("Selling Channel Code")
	public String sellingChannelCode;
	// @JacksonXmlProperty(localName = "seperatorSource0")
	@ApiModelProperty("Sperate Source First")
	public String seperatorSource0;
	// @JacksonXmlProperty(localName = "separatorSource1")
	@ApiModelProperty("Sperate Source Second")
	public String separatorSource1;

	public Source(int id, String clientID, String subClientID, String sellingChannelCode, String seperatorSource0,
			String separatorSource1) {
		super();
		this.id = id;
		this.clientID = clientID;
		this.subClientID = subClientID;
		this.sellingChannelCode = sellingChannelCode;
		this.seperatorSource0 = seperatorSource0;
		this.separatorSource1 = separatorSource1;
	}

	public Source() {
		super();
	}

	@Override
	public String toString() {
		return "Source [id=" + id + ", clientID=" + clientID + ", subClientID=" + subClientID + ", sellingChannelCode="
				+ sellingChannelCode + ", seperatorSource0=" + seperatorSource0 + ", separatorSource1="
				+ separatorSource1 + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getSubClientID() {
		return subClientID;
	}

	public void setSubClientID(String subClientID) {
		this.subClientID = subClientID;
	}

	public String getSellingChannelCode() {
		return sellingChannelCode;
	}

	public void setSellingChannelCode(String sellingChannelCode) {
		this.sellingChannelCode = sellingChannelCode;
	}

	public String getSeperatorSource0() {
		return seperatorSource0;
	}

	public void setSeperatorSource0(String seperatorSource0) {
		this.seperatorSource0 = seperatorSource0;
	}

	public String getSeparatorSource1() {
		return separatorSource1;
	}

	public void setSeparatorSource1(String separatorSource1) {
		this.separatorSource1 = separatorSource1;
	}

}
