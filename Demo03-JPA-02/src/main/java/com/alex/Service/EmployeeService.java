package com.alex.Service;

import com.alex.Entity.Employee;
import com.alex.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/28.
 */

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> showAll(){
        return  employeeRepository.findAll();
    }
    public Page<Employee> getPage(){ return  employeeRepository.test();}


    public void add(Employee employee){ employeeRepository.save(employee);}
    public void addList(List<Employee> employees){employeeRepository.save(employees);}
    public void update(Employee employee){ employeeRepository.save(employee);}
    public void del(Employee employee){ employeeRepository.delete(employee);}


}
