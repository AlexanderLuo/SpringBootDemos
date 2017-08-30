package com.alex.Controller;

import com.alex.Entity.Employee;
import com.alex.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/queryEmPage")
    public Page<Employee> showEmPage(){
        return  employeeService.getPage();
    }

    @RequestMapping("/addRandEm")
    public void addRandEm(){
        Employee employee=new Employee();
        employee.setName((int)(Math.random() * 51)+"-"+(int)(Math.random() * 100));
        employee.setSalary((int)(Math.random() * 8000));
        employeeService.add(employee);
    }
    @RequestMapping("/updataEm")
    public void updataEm(){
        List<Employee> employees=showEm();
        Employee employee=employees.get(0);
        employee.setName((int)(Math.random() * 51)+"-"+(int)(Math.random() * 100));
        employee.setSalary((int)(Math.random() * 8000));
        employeeService.update(employee);
    }
    @RequestMapping("/delEm")
    public void delEm(){
        List<Employee> employees=showEm();
        Employee employee=employees.get(0);
        employeeService.del(employee);
    }
    //`````````````````````````` 怎么才能  手动控制 是否级联查询  以下2个没有区分度
    @RequestMapping("/showEm")
    public List<Employee> showEm(){
        return  employeeService.showAll();
    }










}
