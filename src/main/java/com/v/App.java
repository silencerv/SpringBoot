package com.v;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @anthor v
 * Create on 2018/11/20
 */
@SpringBootApplication
@ComponentScans({@ComponentScan(basePackages = "com.v")})
public class App {

    public static void main(String [] args) {
       SpringApplication.run(App.class, args);
    }
}
