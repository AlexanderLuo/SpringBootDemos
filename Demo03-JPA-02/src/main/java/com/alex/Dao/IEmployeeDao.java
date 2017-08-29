package com.alex.Dao;

import com.alex.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2017/8/28.
 */
public interface IEmployeeDao extends JpaRepository<Employee,Integer>{


    /**
     * 级联查询
     * @return
     */
    @Query("SELECT employee FROM Employee employee JOIN employee.person person WHERE 1=1")
    List<Employee> findAllInfo();
}
