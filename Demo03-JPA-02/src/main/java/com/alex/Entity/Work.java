package com.alex.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/29.
 */

@Entity
@Table(name = "work")
public class Work {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name="id",length = 36)
    private String id;
    @Column(name="detail")
    private String detail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne(targetEntity = Person.class, cascade =CascadeType.ALL)
    @JoinColumn(name = "per_id", foreignKey = @ForeignKey(name = "none"))
    @JsonIgnore
    public Person person;




}
