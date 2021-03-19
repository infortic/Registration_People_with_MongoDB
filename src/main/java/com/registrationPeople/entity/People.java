package com.registrationPeople.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
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

}