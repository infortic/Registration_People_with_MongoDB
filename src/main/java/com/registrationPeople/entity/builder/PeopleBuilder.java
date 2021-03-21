package com.registrationPeople.entity.builder;

import java.util.Date;
import java.util.List;
import com.registrationPeople.entity.Address;
import com.registrationPeople.entity.People;
import com.registrationPeople.entity.Phones;
import lombok.Data;

 /*	
* Author: Cleiton Silva
* created in: 2021/03/20
* */

@Data
public class PeopleBuilder {
	
	private String id;
	private String status;
	private String givenName;
	private String familiyName;
	private Date birthDate;
	private Address address;
	private List<Phones> phones;
	

	public static final PeopleBuilder getInstance() {
		return new PeopleBuilder();
	}

	public PeopleBuilder id(String id) {
		this.id = id;
		return this;
	}

	public PeopleBuilder givenName(String givenName) {
		this.givenName = givenName;
		return this;
	}

	public PeopleBuilder status(String status) {
		this.status = status;
		return this;
	}
	
	public PeopleBuilder familiyName(String familiyName) {
		this.familiyName = familiyName;
		return this;
	}
	
	public PeopleBuilder birthDate(Date birthDate) {
		this.birthDate = birthDate;
		return this;
	}
	
	public PeopleBuilder address(Address address) {
		this.address = address;
		return this;
	}
	
	public PeopleBuilder phones(List<Phones> phones) {
		this.phones = phones;
		return this;
	}
	
	public People builder() {
		return new People(id, status, givenName, familiyName, birthDate, address, phones);
	}
}