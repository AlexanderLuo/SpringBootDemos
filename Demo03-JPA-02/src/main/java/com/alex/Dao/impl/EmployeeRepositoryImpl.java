package com.alex.Dao.impl;

import com.alex.Dao.EmployeeRepositoryCustom;
import com.alex.Entity.Employee;
import com.alex.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 */
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> test() {
        int pageNo=1;
        int pageSize=2;
        Pageable pageable = new PageRequest(pageNo, pageSize, new Sort(Sort.Direction.DESC,"salary"));

        Specification<Employee> spec = (root, query, cb) -> {
            List<Predicate> list = new ArrayList<>();
            return null;
        };


        return employeeRepository.findAll(spec,pageable);
    }


}
