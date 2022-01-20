package com.order.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("User Info Model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {// implements Serializable
	@ApiModelProperty("unique id")
	int id;
	// @JacksonXmlProperty(localName = "firstName")
	@ApiModelProperty("First Name")
	String firstName;
	// @JacksonXmlProperty(localName = "lastName")
	@ApiModelProperty("Last name")
	String lastName;
	// @JacksonXmlProperty(localName = "seperatorName0")
	@ApiModelProperty("Seperate Name first")
	String seperatorName0;
	// @JacksonXmlProperty(localName = "seperatorName1")
	@ApiModelProperty("Seperate name second")
	String seperatorName1;

	@Override
	public String toString() {
		return "Name {id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", seperatorName0="
				+ seperatorName0 + ", seperatorName1=" + seperatorName1 + "}";
	}

	public Name() {
		super();
	}

	public Name(int id, String firstName, String lastName, String seperatorName0, String seperatorName1) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.seperatorName0 = seperatorName0;
		this.seperatorName1 = seperatorName1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSeperatorName0() {
		return seperatorName0;
	}

	public void setSeperatorName0(String seperatorName0) {
		this.seperatorName0 = seperatorName0;
	}

	public String getSeperatorName1() {
		return seperatorName1;
	}

	public void setSeperatorName1(String seperatorName1) {
		this.seperatorName1 = seperatorName1;
	}

}
