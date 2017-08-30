package com.alex.Service;

import com.alex.Entity.Person;
import com.alex.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public void add(Person person){
        personRepository.save(person);
    }
    public List<Person> showAll(){return  personRepository.findAll();}

}
