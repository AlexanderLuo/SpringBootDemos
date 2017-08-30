package com.alex.repository;

import com.alex.Dao.EmployeeRepositoryCustom;
import com.alex.Dao.PersonRepositoryCustom;
import com.alex.Entity.Employee;
import com.alex.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2017/8/29.
 */
public interface PersonRepository extends PersonRepositoryCustom,JpaRepository<Person,String>,JpaSpecificationExecutor<Person> {

}
