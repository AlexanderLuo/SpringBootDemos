package com.alex.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/28.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name="id",length = 36)
    private String id;
    @Column(name="salary")
    private int salary;
    @Column(name="name")
    private String name;



    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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


    @OneToOne(targetEntity = Person.class, cascade =CascadeType.ALL)
    @JoinColumn(name="id",foreignKey = @ForeignKey(name = "none"))
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
