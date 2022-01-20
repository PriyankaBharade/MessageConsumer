package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AddressEntity")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name = "line1")
	String line1;
	@Column(name = "line2")
	String line2;
	@Column(name = "line3")
	String line3;
	@Column(name = "city")
	String city;
	@Column(name = "state")
	String state;
	@Column(name = "zipCode")
	String zipCode;
	@Column(name = "countryCode")
	String countryCode;
	@Column(name = "seperatorAddress0")
	String seperatorAddress0;

	
	
	

	@Override
	public String toString() {
		return "AddressEntity {id=" + id + ", line1=" + line1 + ", line2=" + line2 + ", line3=" + line3 + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + ", countryCode=" + countryCode
				+ ", seperatorAddress0=" + seperatorAddress0 + "}";
	}



	public AddressEntity(int id, String line1, String line2, String line3, String city, String state, String zipCode,
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

	

	public AddressEntity() {
		super();
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
