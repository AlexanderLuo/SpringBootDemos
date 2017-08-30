package com.alex.Controller;

import com.alex.Entity.Employee;
import com.alex.Entity.Person;
import com.alex.Entity.Work;
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

    @RequestMapping("/addRandPerWithWork")
    public void addRandPer(){
        Person person=new Person();
        person.setAge((int)(Math.random() * 51));
        person.setName("N"+(int)(Math.random() * 5111));
        Work work=new Work();
        work.setDetail(Math.random() * 51444+"");
        work.setPerson(person);
        ArrayList arrayList=new ArrayList();
        arrayList.add(work);
        person.setWorksList(arrayList);

//        person.setEmployee(new Employee());
        personService.add(person);
    }

    @RequestMapping("/addRandPerWithEm")
    public void addRandPerWithEm(){
        Person person=new Person();
        person.setAge((int)(Math.random() * 51));
        person.setName("addRandPerWithEm"+(int)(Math.random() * 5111));
        Employee employee=new Employee();
        employee.setSalary((int)(Math.random() * 5111));
        employee.setName(person.getName());
        employee.setPerson(person);
//        person.setEmployee(new Employee());
        personService.add(person);
    }



    @RequestMapping("/updatePer")
    public void updatePer(){

        List<Person> list=personService.showAll();
        Person person=list.get(0);
        person.setName("fix");
        personService.add(person);

    }




}
