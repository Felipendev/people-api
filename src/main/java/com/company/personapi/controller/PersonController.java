package com.company.personapi.controller;

import com.company.personapi.dto.request.PersonDTO;
import com.company.personapi.dto.response.MessageResponseDTO;
import com.company.personapi.entity.Person;
import com.company.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {

   private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDto) {
        return personService.createPerson(personDto);
    }

//    @GetMapping
//    @ResponseStatus()
//    public List<PersonDTO> listAll(@RequestBody PersonDTO personDto) {
//        return personService.listAll(personDto.getFirstName());
//    }
}
