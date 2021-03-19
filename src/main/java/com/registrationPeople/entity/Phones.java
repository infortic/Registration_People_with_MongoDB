package com.registrationPeople.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Phones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Integer phoneNumber;

}
