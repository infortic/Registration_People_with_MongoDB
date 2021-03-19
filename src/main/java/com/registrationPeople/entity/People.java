package com.registrationPeople.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.google.gson.Gson;

import lombok.Data;

@Data
@Document
public class People implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String status;
	private String givenName;
	private String familiyName;
	private Date birthDate;
	private Address address;
	private List<Phones> phones;
	
	
	public People(String id, String status, String givenName, String familiyName, Date birthDate, Address address,
			List<Phones> phones) {
		super();
		this.id = id;
		this.status = status;
		this.givenName = givenName;
		this.familiyName = familiyName;
		this.birthDate = birthDate;
		this.address = address;
		this.phones = phones;
	}

	public static final People peopleFromJson(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, People.class);
	}

	
}