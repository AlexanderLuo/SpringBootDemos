package com.alex.repository;

import com.alex.Dao.EmployeeRepositoryCustom;
import com.alex.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 */
public interface EmployeeRepository extends EmployeeRepositoryCustom,JpaRepository<Employee,String>,JpaSpecificationExecutor<Employee> {


}
