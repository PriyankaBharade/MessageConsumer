package com.order.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "BillingAddressEntity")
public class BillingAddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	//@Column(name = "contact")
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="contact_id")
	public ContactEntity contact;

	@Override
	public String toString() {
		return "BillingAddressEntity {id=" + id + ", contact=" + contact + "}";
	}

	public BillingAddressEntity() {
		super();
	}

	public BillingAddressEntity(int id, ContactEntity contact) {
		super();
		this.id = id;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ContactEntity getContact() {
		return contact;
	}

	public void setContact(ContactEntity contact) {
		this.contact = contact;
	}

}
