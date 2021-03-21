package com.registrationPeople.services;

import java.util.List;
import com.registrationPeople.entity.People;

/*	
* Author: Cleiton Silva
* created in: 2021/03/20
* */

public interface RestService {
	
	public List<People> getAll();
	
	public People getByCode(String id);
	
	public People create(People people);
	
	public String delete(People people);
	
}
