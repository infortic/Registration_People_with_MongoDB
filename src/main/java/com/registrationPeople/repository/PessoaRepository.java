package com.registrationPeople.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.registrationPeople.entity.People;

/*	
* Author: Cleiton Silva
* created in: 2021/03/20
* */

public interface PessoaRepository extends MongoRepository<People, String>{

}
