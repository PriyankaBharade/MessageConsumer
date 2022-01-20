package com.order.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Conatact Model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {// implements Serializable
	@ApiModelProperty("unique id")
	int id;
	// @JacksonXmlProperty(localName = "custID")
	@ApiModelProperty("Customer Id")
	String custID;
	// @JacksonXmlProperty(localName = "daytimePhoneNbr")
	@ApiModelProperty("Day Time Phone Number")
	String daytimePhoneNbr;
	// @JacksonXmlProperty(localName = "homePhoneNbr")
	@ApiModelProperty("Home Phone Number")
	String homePhoneNbr;
	// @JacksonXmlProperty(localName = "alternatePhoneNbr")
	@ApiModelProperty("Alternate Phone Number")
	String alternatePhoneNbr;
	// @JacksonXmlProperty(localName = "sendSMSMessage")
	@ApiModelProperty("Sms Message")
	String sendSMSMessage;
	// @JacksonXmlProperty(localName = "emailAddress")
	@ApiModelProperty("Email Address")
	String emailAddress;
	// @JacksonXmlProperty(localName = "seperatorContact0")
	@ApiModelProperty("Seperate Contact")
	String seperatorContact0;
	// @JacksonXmlProperty(localName = "Address")
	@ApiModelProperty("Address")
	Address Address;
	// @JacksonXmlProperty(localName = "Name")
	@ApiModelProperty("Name")
	Name Name;

	@Override
	public String toString() {
		return "Contact {id=" + id + ", custID=" + custID + ", daytimePhoneNbr=" + daytimePhoneNbr + ", homePhoneNbr="
				+ homePhoneNbr + ", alternatePhoneNbr=" + alternatePhoneNbr + ", sendSMSMessage=" + sendSMSMessage
				+ ", emailAddress=" + emailAddress + ", seperatorContact0=" + seperatorContact0 + ", Address=" + Address
				+ ", Name=" + Name + "}";
	}

	public Contact() {
		super();
	}

	public Contact(int id, String custID, String daytimePhoneNbr, String homePhoneNbr, String alternatePhoneNbr,
			String sendSMSMessage, String emailAddress, String seperatorContact0, com.order.dto.Address address,
			com.order.dto.Name name) {
		super();
		this.id = id;
		this.custID = custID;
		this.daytimePhoneNbr = daytimePhoneNbr;
		this.homePhoneNbr = homePhoneNbr;
		this.alternatePhoneNbr = alternatePhoneNbr;
		this.sendSMSMessage = sendSMSMessage;
		this.emailAddress = emailAddress;
		this.seperatorContact0 = seperatorContact0;
		Address = address;
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getDaytimePhoneNbr() {
		return daytimePhoneNbr;
	}

	public void setDaytimePhoneNbr(String daytimePhoneNbr) {
		this.daytimePhoneNbr = daytimePhoneNbr;
	}

	public String getHomePhoneNbr() {
		return homePhoneNbr;
	}

	public void setHomePhoneNbr(String homePhoneNbr) {
		this.homePhoneNbr = homePhoneNbr;
	}

	public String getAlternatePhoneNbr() {
		return alternatePhoneNbr;
	}

	public void setAlternatePhoneNbr(String alternatePhoneNbr) {
		this.alternatePhoneNbr = alternatePhoneNbr;
	}

	public String getSendSMSMessage() {
		return sendSMSMessage;
	}

	public void setSendSMSMessage(String sendSMSMessage) {
		this.sendSMSMessage = sendSMSMessage;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSeperatorContact0() {
		return seperatorContact0;
	}

	public void setSeperatorContact0(String seperatorContact0) {
		this.seperatorContact0 = seperatorContact0;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public Name getName() {
		return Name;
	}

	public void setName(Name name) {
		Name = name;
	}

}
