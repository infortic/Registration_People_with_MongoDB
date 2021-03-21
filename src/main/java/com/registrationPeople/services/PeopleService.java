package com.registrationPeople.services;

import java.util.List;
import com.registrationPeople.entity.People;

public interface PeopleService {
	
	public List<People> getAll();
	
	public People getByCode(String id);
	
	public People create(People people);
	
	public String delete(People people);
	
}
