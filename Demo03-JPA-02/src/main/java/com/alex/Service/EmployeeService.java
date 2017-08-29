package com.alex.Service;

import com.alex.Dao.IEmployeeDao;
import com.alex.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/28.
 */
@Service
public class EmployeeService {
    @Autowired
    IEmployeeDao employeeDao;
    public List<Employee> showAll(){
        return  employeeDao.findAll();
    }
    public List<Employee> showEx(){
        return  employeeDao.findAllInfo();
    }

}
