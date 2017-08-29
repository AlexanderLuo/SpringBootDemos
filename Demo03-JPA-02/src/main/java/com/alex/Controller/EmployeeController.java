package com.alex.Controller;

import com.alex.Entity.Employee;
import com.alex.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping("/showEmEx")
    public List<Employee> showPerson(){
        return  employeeService.showEx();
    }


}
