package com.registrationPeople.services.ipl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrationPeople.entity.People;
import com.registrationPeople.repository.PessoaRepository;
import com.registrationPeople.services.PeopleService;

@Service
public class PeopleServiceImp implements PeopleService{

	@Autowired
	private PessoaRepository dao;
	
	@Override
	public List<People> getAllPeople() {
		return this.dao.findAll();
	}

	@Override
	public People getPeopleByCode(String id) {
		return this.dao
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Não existe pessoa com este código: " + id));
	}

	@Override
	public People create(People people) {
		return this.dao.save(people);
	}

}
