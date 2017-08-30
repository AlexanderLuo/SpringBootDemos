package com.alex.Controller;

import com.alex.Entity.Person;
import com.alex.Service.PersonService;
import com.alex.Service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/29.
 */

@RestController
public class WorkController {
    @Autowired
    WorkService workService;

    @RequestMapping("/addRandWork")
    public void addRandWork(){

    }

}
