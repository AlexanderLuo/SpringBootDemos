package com.alex.Controller;

import com.alex.Entity.User;
import com.alex.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService service;

    @RequestMapping("/test")
    public List<User> getUserList(@RequestParam String name){
        return service.getUsers(name);
    }

}
