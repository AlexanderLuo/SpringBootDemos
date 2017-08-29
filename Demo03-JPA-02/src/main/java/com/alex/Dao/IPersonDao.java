package com.alex.Dao;

import com.alex.Entity.Employee;
import com.alex.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2017/8/28.
 */
public interface IPersonDao extends JpaRepository<Person,Integer> {

    /**
     * 级联查询
     * @return
     */
    @Query("SELECT person FROM Person person JOIN person.employee employee ")
    List<Person> findAllPerEx();

}
