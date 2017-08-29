package com.alex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/28.
 */
@Controller
public class IndexController {

    public class index {
        @RequestMapping("/")
        public String index() {
            return "index";
        }
    }

}
