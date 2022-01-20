package com.order.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Address Info Model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {/// implements Serializable
	// @JacksonXmlProperty(localName = "line1")
	@ApiModelProperty("unique id")
	int id;
	@ApiModelProperty("Address Line first")
	String line1;
	// @JacksonXmlProperty(localName = "line2")
	@ApiModelProperty("Address Line Second")
	String line2;
	// @JacksonXmlProperty(localName = "line3")
	@ApiModelProperty("Address Line Third")
	String line3;
	// @JacksonXmlProperty(localName = "city")
	@ApiModelProperty("City Name")
	String city;
	// @JacksonXmlProperty(localName = "state")
	@ApiModelProperty("State Name")
	String state;
	// @JacksonXmlProperty(localName = "zipCode")
	@ApiModelProperty("Zip Code")
	String zipCode;
	// @JacksonXmlProperty(localName = "countryCode")
	@ApiModelProperty("Country Code")
	String countryCode;
	// @JacksonXmlProperty(localName = "seperatorAddress0")
	@ApiModelProperty("Seperate Address")
	String seperatorAddress0;

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address {id=" + id + ", line1=" + line1 + ", line2=" + line2 + ", line3=" + line3 + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", countryCode=" + countryCode + ", seperatorAddress0="
				+ seperatorAddress0 + "}";
	}

	public Address(int id, String line1, String line2, String line3, String city, String state, String zipCode,
			String countryCode, String seperatorAddress0) {
		super();
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.countryCode = countryCode;
		this.seperatorAddress0 = seperatorAddress0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getSeperatorAddress0() {
		return seperatorAddress0;
	}

	public void setSeperatorAddress0(String seperatorAddress0) {
		this.seperatorAddress0 = seperatorAddress0;
	}

}
