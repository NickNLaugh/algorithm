package com.test.control;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

}
