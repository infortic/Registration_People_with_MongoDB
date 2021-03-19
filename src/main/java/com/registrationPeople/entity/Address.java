package com.registrationPeople.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

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
     
     
	
}
