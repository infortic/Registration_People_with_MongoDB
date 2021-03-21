package com.registrationPeople.resource;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.registrationPeople.entity.People;
import com.registrationPeople.services.ipl.PeopleServiceImp;
import io.swagger.annotations.ApiOperation;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/people")
public class PeopleController {

	@Autowired
	private PeopleServiceImp peopleService;

	
	@ApiOperation(value="Find All People")
	@GetMapping
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<>(peopleService.getAll() , HttpStatus.OK);
	}
	
	@ApiOperation(value="Find People by ID")
	@GetMapping("/{id}")
	public ResponseEntity<?> pesquisar(@PathVariable(required = true) String id) throws ParseException {
		return new ResponseEntity<>(peopleService.getByCode(id), HttpStatus.OK);
	}
	
	@ApiOperation(value="creat or update people")
	@PostMapping
	public ResponseEntity<?> creat(@RequestBody People people) throws ParseException {
		return new ResponseEntity<>(peopleService.create(people), HttpStatus.CREATED);
	}
	
	@ApiOperation(value="Delete people")
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@RequestBody People people) throws ParseException {
		return new ResponseEntity<>(peopleService.delete(people), HttpStatus.CREATED);
	}
}
