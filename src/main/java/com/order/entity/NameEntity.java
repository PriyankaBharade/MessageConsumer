package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NameEntity")
public class NameEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name = "firstName")
	String firstName;
	@Column(name = "lastName")
	String lastName;
	@Column(name = "seperatorName0")
	String seperatorName0;
	@Column(name = "seperatorName1")
	String seperatorName1;
	
	
	@Override
	public String toString() {
		return "NameEntity {id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", seperatorName0="
				+ seperatorName0 + ", seperatorName1=" + seperatorName1 + "}";
	}


	public NameEntity() {
		super();
	}


	public NameEntity(int id, String firstName, String lastName, String seperatorName0, String seperatorName1) {
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
