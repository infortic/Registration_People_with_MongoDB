package com.registrationPeople;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.registrationPeople.entity.Address;
import com.registrationPeople.entity.People;
import com.registrationPeople.entity.Phones;
import com.registrationPeople.entity.builder.AddressBuilder;
import com.registrationPeople.entity.builder.PeopleBuilder;
import com.registrationPeople.entity.builder.PhoneBuilder;
import com.registrationPeople.services.ipl.PeopleServiceImp;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class RegistrationPeopleTest {

	@Autowired
	private PeopleServiceImp peopleService;

	@Mock
	private PeopleServiceImp peopleServiceMOCK;

	
	@Autowired
	private TestRestTemplate restTemplet;
	
	@LocalServerPort
	private int port;
		
	@Test
	void getAllPeopleTest() {
		ResponseEntity<?> response = this.restTemplet.getForEntity("/people", String.class);
		Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
		Assertions.assertThat(response.getBody()).isNotNull();
	}
	
	@Test
	void getPeopleByAssertCode200Test() {
		
		Phones phones = PhoneBuilder
				.getInstance()
				.id("12")
				.phoneNumber(12112)
				.builder();
		
		Address address = AddressBuilder
				.getInstance()
				.id("121")
				.city("Cidade dos Anjos")
				.builder();
		
		List<Phones> phonesList = new ArrayList<>(); 
		phonesList.add(phones);
				
		People people = PeopleBuilder
				.getInstance()
				.id("1212")
				.phones(phonesList)
				.address(address)
				.builder();
		
		this.peopleService.createPeople(people);
		
		ResponseEntity<?> response = this.restTemplet.getForEntity("/people/1212", String.class);
		Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
		Assertions.assertThat(response.getBody()).isNotNull();
		
		People peopleResponse = People.peopleFromJson(response.getBody().toString());
		
		Assertions.assertThat(peopleResponse.getId()).isEqualTo("1212");
		
		this.peopleService.deletePeople(people);
		
	}
	

	@Test
	void getPeopleByErroCode500Test() {
		ResponseEntity<?> response = this.restTemplet.getForEntity("/people/1212", String.class);
		Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(500);
		
	}

	@Test
	void postCreatePeople201Test() {
		
		Phones phones = PhoneBuilder
				.getInstance()
				.id("1515")
				.phoneNumber(12112)
				.builder();
		
		Address address = AddressBuilder
				.getInstance()
				.id("951")
				.city("Cidade dos Anjos")
				.builder();
		
		List<Phones> phonesList = new ArrayList<>(); 
		phonesList.add(phones);
				
		People people = PeopleBuilder
				.getInstance()
				.id("666")
				.phones(phonesList)
				.address(address)
				.builder();
	
		ResponseEntity<?> response = this.restTemplet.postForEntity("/people", people,String.class);
		Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(201);
		
	}
}
