package com.v.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @anthor v
 * Create on 2018/11/20
 */
@RestController
public class
HelloWorldController {

    @RequestMapping("/")
    String helloWorld(){
        return "Hello world";
    }

    @RequestMapping("/close")
    String closeWorld(){
        return "Close world";
    }

}
