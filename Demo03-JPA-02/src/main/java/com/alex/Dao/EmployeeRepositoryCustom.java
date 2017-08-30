package com.alex.Dao;

import com.alex.Entity.Employee;
import org.springframework.data.domain.Page;

/**
 * Created by Administrator on 2017/8/28.
 */
public interface EmployeeRepositoryCustom {

    Page<Employee> test();

}
