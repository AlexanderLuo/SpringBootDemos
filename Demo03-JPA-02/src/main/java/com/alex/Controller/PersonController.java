package com.alex.Controller;

import com.alex.Entity.Person;
import com.alex.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/28.
 */
@RestController
public class PersonController {

    @Autowired
    PersonService personService;
    @RequestMapping("/showPerson")
    public List<Person> showPerson(){
        return  personService.showAll();
    }




    @RequestMapping("/addOne")
    public void addOne(){
        Person person=new Person();
        person.setAge(10);
        person.setName("luo");
        personService.save(person);
    }
    @RequestMapping("/addList")
    public void addList(){
        Person person=new Person();
        person.setAge(100);
        person.setName("lu");
        Person personb=new Person();
        personb.setAge(88);
        personb.setName("fsad");
        ArrayList arrayList=new ArrayList();
        arrayList.add(person);
        arrayList.add(personb);
        personService.save(arrayList);
    }

    @RequestMapping("/showPerEx")
    public List<Person> showPerEx(){
        return personService.showPerEx();
    }


}
