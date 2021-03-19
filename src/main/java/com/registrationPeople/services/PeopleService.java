package com.registrationPeople.services;

import java.util.List;
import com.registrationPeople.entity.People;

public interface PeopleService {
	
	public List<People> getAllPeople();
	
	public People getPeopleByCode(String id);
	
	public People create(People people);
	
}
