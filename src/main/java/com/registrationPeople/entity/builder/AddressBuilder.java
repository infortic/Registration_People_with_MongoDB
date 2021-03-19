package com.registrationPeople.entity.builder;

import org.springframework.data.annotation.Id;

import com.registrationPeople.entity.Address;

public class AddressBuilder {
	
	private String id;
	private String type;
	private String zipcode;
	private String state;
	private String city;
	private String street;
	private Integer number;
	private String complement;
	private String district;
	


	public AddressBuilder id(String id) {
		this.id = id;
		return this;
	}


	public AddressBuilder type(String type) {
		this.type = type;
		return this;
	}


	public AddressBuilder zipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}


	public AddressBuilder state(String state) {
		this.state = state;
		return this;
	}


	public AddressBuilder city(String city) {
		this.city = city;
		return this;
	}


	public AddressBuilder street(String street) {
		this.street = street;
		return this;
	}


	public AddressBuilder number(Integer number) {
		this.number = number;
		return this;
	}


	public AddressBuilder complement(String complement) {
		this.complement = complement;
		return this;
	}


	public AddressBuilder district(String district) {
		this.district = district;
		return this;
	}

	
	
	public Address builder() {
		return new Address(id, type, zipcode, state, city, street, number, complement, district);
	}
	
	public static final AddressBuilder getInstance() {
		return new AddressBuilder();
	}
	
	
}
