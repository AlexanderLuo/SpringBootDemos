package com.alex.Entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/28.
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    @OneToOne(mappedBy="person",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
