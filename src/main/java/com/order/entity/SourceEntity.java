package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SourceEntity")
public class SourceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name = "clientID")
	public String clientID;
	@Column(name = "subClientID")
	public String subClientID;
	@Column(name = "sellingChannelCode")
	public String sellingChannelCode;
	@Column(name = "seperatorSource0")
	public String seperatorSource0;
	@Column(name = "separatorSource1")
	public String separatorSource1;

	@Override
	public String toString() {
		return "SourceEntity [id=" + id + ", clientID=" + clientID + ", subClientID=" + subClientID
				+ ", sellingChannelCode=" + sellingChannelCode + ", seperatorSource0=" + seperatorSource0
				+ ", separatorSource1=" + separatorSource1 + "]";
	}

	public SourceEntity() {
		super();
	}

	public SourceEntity(int id, String clientID, String subClientID, String sellingChannelCode, String seperatorSource0,
			String separatorSource1) {
		super();
		this.id = id;
		this.clientID = clientID;
		this.subClientID = subClientID;
		this.sellingChannelCode = sellingChannelCode;
		this.seperatorSource0 = seperatorSource0;
		this.separatorSource1 = separatorSource1;
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
