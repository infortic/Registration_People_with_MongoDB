package com.registrationPeople.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

/*	
* Author: Cleiton Silva
* created in: 2021/03/20
* */

@Data
@Document
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	 @Id
	 private String id;
	 private String type;
     private String zipcode;
     private String state;
     private String city;
     private String street;
     private Integer number;
     private String complement;
     private String district;
     
     
	public Address(String id, String type, String zipcode, String state, String city, String street, Integer number,
			String complement, String district) {
		super();
		this.id = id;
		this.type = type;
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.district = district;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
     
     
	
}
