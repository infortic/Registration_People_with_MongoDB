package com.registrationPeople.services.ipl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registrationPeople.entity.People;
import com.registrationPeople.repository.PessoaRepository;
import com.registrationPeople.services.RestService;

   /*	
 * Author: Cleiton Silva
 * created in: 2021/03/20
 * */

@Service
public class PeopleServiceImp implements RestService{

	@Autowired
	private PessoaRepository dao;

	@Override
	public List<People> getAll() {
		return this.dao.findAll();
	}

	@Override
	public People getByCode(String id) {
		return this.dao.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Não existe pessoa com este código: " + id));
	}

	@Override
	public People create(People people) {
		return this.dao.save(people);
	}

	@Override
	public String delete(People people) {
		try {
			this.dao.delete(people);
			return "Registro Removido";
		} catch (Exception e) {
			return "Erro: "+ e;
		}
	}

}
