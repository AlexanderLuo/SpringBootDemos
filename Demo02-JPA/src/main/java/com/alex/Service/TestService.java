package com.alex.Service;

import com.alex.Dao.ITestDao;
import com.alex.Entity.User;
import groovy.transform.AutoClone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    ITestDao testDao;
    public List<User> getUsers(String name){
        return  testDao.findByName(name);
    }
}
