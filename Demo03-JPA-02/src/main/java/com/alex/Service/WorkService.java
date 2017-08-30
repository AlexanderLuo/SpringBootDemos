package com.alex.Service;

import com.alex.Entity.Work;
import com.alex.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 */
@Service
public class WorkService {
    @Autowired
    WorkRepository workRepository;

}
