package com.alex.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2017/8/28.
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name="id",length = 36)
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;




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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    @OneToOne(targetEntity = Employee.class, cascade =CascadeType.ALL)
    @JoinColumn(name="em_id",foreignKey = @ForeignKey(name = "none"))
    @JsonIgnore
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    /**
     * 工作列表
     */
    @OneToMany(targetEntity = Work.class, cascade =CascadeType.ALL)
    @JoinColumn(name = "id", foreignKey = @ForeignKey(name = "none"))
    public List<Work> worksList;

    public List<Work> getWorksList() {
        return worksList;
    }

    public void setWorksList(List<Work> worksList) {
        this.worksList = worksList;
    }
}
