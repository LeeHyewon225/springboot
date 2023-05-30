package org.example.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello") //localhost:8080/hello
    public String hello(){
        return "hello";  //화면에 hello 출력
    }
}
