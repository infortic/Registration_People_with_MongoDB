package com.registrationPeople.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.google.gson.Gson;

import lombok.Data;

/*	
* Author: Cleiton Silva
* created in: 2021/03/20
* */

@Data
@Document
public class People implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotBlank
	private String id;
	private String status;
	@NotBlank
	private String givenName;
	private String familiyName;
	private Date birthDate;
	@NotBlank
	private Address address;
	@NotBlank
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