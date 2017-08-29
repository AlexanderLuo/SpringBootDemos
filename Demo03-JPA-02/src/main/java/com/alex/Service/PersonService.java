package com.alex.Service;

import com.alex.Dao.IPersonDao;
import com.alex.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PersonService {
    @Autowired
    IPersonDao personDao;
    public void save(Person person){
        personDao.save(person);
    }
    public void save(List<Person> persons){
          personDao.save(persons);
    }
    public List<Person> showAll(){
        return  personDao.findAll();
    }
    public List<Person> showPerEx(){return  personDao.findAllPerEx();}

}
