package com.registrationPeople.entity.builder;

import com.registrationPeople.entity.Phones;

public class PhoneBuilder {

	private String id;
	private Integer phoneNumber;
	
	
	
	
	public PhoneBuilder id(String id) {
		this.id = id;
		return this;
	}

	public PhoneBuilder phoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Phones builder() {
		return new Phones(id, phoneNumber);
	}
	
	public static final PhoneBuilder getInstance() {
		return new PhoneBuilder();
	}
	
}
