package com.fastcampus.ch4.controller;

import com.fastcampus.ch4.domain.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//@RestController  //@Controller 대신 @RestController를 적어서 @ResponseBody 생략 가능
@Controller
public class SimpleRestController {
//    @GetMapping("/ajax")
//    public String ajax() {
//        return "ajax";
//    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

//    @PostMapping("/send")
////    @ResponseBody
//    public Person test(Person p) {
//        System.out.println("p = " + p);
//        p.setName("ABC");
//        p.setAge(p.getAge() + 10);
//
//        return p;
//    }
//
//    @PostMapping("/send")
////    @ResponseBody
//    public Person test2(Person p) {
//        System.out.println("p = " + p);
//        p.setName("ABC");
//        p.setAge(p.getAge() + 10);
//
//        return p;
//    }
}