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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamiliyName() {
		return familiyName;
	}

	public void setFamiliyName(String familiyName) {
		this.familiyName = familiyName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Phones> getPhones() {
		return phones;
	}

	public void setPhones(List<Phones> phones) {
		this.phones = phones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}