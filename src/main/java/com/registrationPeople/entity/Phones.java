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
public class Phones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Integer phoneNumber;
	
	public Phones(String id, Integer phoneNumber) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
