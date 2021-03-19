package com.registrationPeople.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.registrationPeople.entity.People;

public interface PessoaRepository extends MongoRepository<People, String>{

}
