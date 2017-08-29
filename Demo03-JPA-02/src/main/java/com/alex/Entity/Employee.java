package com.alex.Entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/28.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="salary")
    private int salary;
    @Column(name="name")
    private String name;
    @Column(name = "personid")
    private int  personId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name="personid", referencedColumnName="id", insertable=false, updatable=false)
    private Person person;
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }


}
