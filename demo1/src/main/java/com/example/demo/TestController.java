package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Date;

@RestController
public class TestController {
    @GetMapping("/api/hello")
    public String hello(){
        return "안녕하세요11. 현재 서버시간은 "+new Date() +"입니다. \n";
    }
}