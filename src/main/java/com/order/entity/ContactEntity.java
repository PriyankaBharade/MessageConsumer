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

import com.order.dto.Address;
import com.order.dto.Name;

@Entity
@Table(name = "ContactEntity")
public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name = "custID")
	public String custID;
	@Column(name = "daytimePhoneNbr")
	public String daytimePhoneNbr;
	@Column(name = "homePhoneNbr")
	public String homePhoneNbr;
	@Column(name = "alternatePhoneNbr")
	public String alternatePhoneNbr;
	@Column(name = "sendSMSMessage")
	public String sendSMSMessage;
	@Column(name = "emailAddress")
	public String emailAddress;
	@Column(name = "seperatorContact0")
	public String seperatorContact0;
	//@Column(name = "Address")
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="address_id")
	public AddressEntity Address;
	//@Column(name = "Name")
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="names_id")
	public NameEntity Name;

	@Override
	public String toString() {
		return "ContactEntity {id=" + id + ", custID=" + custID + ", daytimePhoneNbr=" + daytimePhoneNbr
				+ ", homePhoneNbr=" + homePhoneNbr + ", alternatePhoneNbr=" + alternatePhoneNbr + ", sendSMSMessage="
				+ sendSMSMessage + ", emailAddress=" + emailAddress + ", seperatorContact0=" + seperatorContact0
				+ ", Address=" + Address + ", Name=" + Name + "}";
	}

	public ContactEntity() {
		super();
	}

	public ContactEntity(int id, String custID, String daytimePhoneNbr, String homePhoneNbr, String alternatePhoneNbr,
			String sendSMSMessage, String emailAddress, String seperatorContact0, AddressEntity address,
			NameEntity name) {
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

	public AddressEntity getAddress() {
		return Address;
	}

	public void setAddress(AddressEntity address) {
		Address = address;
	}

	public NameEntity getName() {
		return Name;
	}

	public void setName(NameEntity name) {
		Name = name;
	}

}
