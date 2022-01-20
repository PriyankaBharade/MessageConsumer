package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderProduced")
public class OrderProducerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name = "messageName")
	public String messageName;
	@Column(name = "command")
	public String command;
	@Column(name = "itemName")
	public String itemName;
	@Column(name = "itemDescription")
	public String itemDescription;
	@Column(name = "itemLength")
	public Double itemLength;
	@Column(name = "itemWidth")
	public Double itemWidth;
	@Column(name = "itemHeight")
	public Double itemHeight;
	@Column(name = "itemWeight")
	public Double itemWeight;
	@Column(name = "imagePathname")
	public String imagePathname;
	@Column(name = "rfidTagged")
	public String rfidTagged;
	@Column(name = "storageAttribute")
	public String storageAttribute;
	@Column(name = "pickType")
	public String pickType;
	@Column(name = "upcList")
	public String upcList;

	
	public OrderProducerEntity() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "OrderProducerEntity [id=" + id + ", messageName=" + messageName + ", command=" + command + ", itemName="
				+ itemName + ", itemDescription=" + itemDescription + ", itemLength=" + itemLength + ", itemWidth="
				+ itemWidth + ", itemHeight=" + itemHeight + ", itemWeight=" + itemWeight + ", imagePathname="
				+ imagePathname + ", rfidTagged=" + rfidTagged + ", storageAttribute=" + storageAttribute
				+ ", pickType=" + pickType + ", upcList=" + upcList + "]";
	}



	public OrderProducerEntity(int id, String messageName, String command, String itemName, String itemDescription,
			Double itemLength, Double itemWidth, Double itemHeight, Double itemWeight, String imagePathname,
			String rfidTagged, String storageAttribute, String pickType, String upcList) {
		super();
		this.id = id;
		this.messageName = messageName;
		this.command = command;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemLength = itemLength;
		this.itemWidth = itemWidth;
		this.itemHeight = itemHeight;
		this.itemWeight = itemWeight;
		this.imagePathname = imagePathname;
		this.rfidTagged = rfidTagged;
		this.storageAttribute = storageAttribute;
		this.pickType = pickType;
		this.upcList = upcList;
	}



	public int getInt() {
		return id;
	}

	public void setMessageName(int id) {
		this.id = id;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Double getItemLength() {
		return itemLength;
	}

	public void setItemLength(Double itemLength) {
		this.itemLength = itemLength;
	}

	public Double getItemWidth() {
		return itemWidth;
	}

	public void setItemWidth(Double itemWidth) {
		this.itemWidth = itemWidth;
	}

	public Double getItemHeight() {
		return itemHeight;
	}

	public void setItemHeight(Double itemHeight) {
		this.itemHeight = itemHeight;
	}

	public Double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(Double itemWeight) {
		this.itemWeight = itemWeight;
	}

	public String getImagePathname() {
		return imagePathname;
	}

	public void setImagePathname(String imagePathname) {
		this.imagePathname = imagePathname;
	}

	public String getRfidTagged() {
		return rfidTagged;
	}

	public void setRfidTagged(String rfidTagged) {
		this.rfidTagged = rfidTagged;
	}

	public String getStorageAttribute() {
		return storageAttribute;
	}

	public void setStorageAttribute(String storageAttribute) {
		this.storageAttribute = storageAttribute;
	}

	public String getPickType() {
		return pickType;
	}

	public void setPickType(String pickType) {
		this.pickType = pickType;
	}

	public String getUpcList() {
		return upcList;
	}

	public void setUpcList(String upcList) {
		this.upcList = upcList;
	}

}
