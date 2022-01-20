package com.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Order Produce Model")
public class OrderProducer {
	@ApiModelProperty("Unique indentifier of the Product")
	public int id;
	@ApiModelProperty("Message for the Product")
	public String messageName;
	@ApiModelProperty("Command for the Product")
	public String command;
	@ApiModelProperty("Name of the Product")
	public String itemName;
	@ApiModelProperty("Description of the Product")
	public String itemDescription;
	@ApiModelProperty("Length of the Product")
	public Double itemLength;
	@ApiModelProperty("Width of the Product")
	public Double itemWidth;
	@ApiModelProperty("Height of the Product")
	public Double itemHeight;
	@ApiModelProperty("Weight of the Product")
	public Double itemWeight;
	@ApiModelProperty("Pathname of the Product Image")
	public String imagePathname;
	@ApiModelProperty("Tagged of the Product")
	public String rfidTagged;
	@ApiModelProperty("Storage Attribute of the Product")
	public String storageAttribute;
	@ApiModelProperty("Pick Type")
	public String pickType;
	@ApiModelProperty("Upc List of the Product")
	public String upcList;

	public OrderProducer() {
		super();
	}

	@Override
	public String toString() {
		return "OrderProducer {id=" + id + ", messageName=" + messageName + ", command=" + command + ", itemName="
				+ itemName + ", itemDescription=" + itemDescription + ", itemLength=" + itemLength + ", itemWidth="
				+ itemWidth + ", itemHeight=" + itemHeight + ", itemWeight=" + itemWeight + ", imagePathname="
				+ imagePathname + ", rfidTagged=" + rfidTagged + ", storageAttribute=" + storageAttribute
				+ ", pickType=" + pickType + ", upcList=" + upcList + "}";
	}

	public OrderProducer(int id, String messageName, String command, String itemName, String itemDescription,
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
