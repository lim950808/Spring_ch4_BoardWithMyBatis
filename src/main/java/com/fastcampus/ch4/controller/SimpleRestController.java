//package com.fastcampus.ch4.controller;
//
//import com.fastcampus.ch4.domain.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;
//
//@RestController //@Controller 대신 @RestController를 적어서 @ResponseBody 생략 가능
//public class SimpleRestController {
////    @GetMapping("/ajax")
////    public String ajax() {
////        return "ajax";
////    }
//
//    @PostMapping("/send")
////    @ResponseBody
//    public Person test(@RequestBody Person p) {
//        System.out.println("p = " + p);
//        p.setName("ABC");
//        p.setAge(p.getAge() + 10);
//
//        return p;
//    }
//
//    @PostMapping("/send")
////    @ResponseBody
//    public Person test2(@RequestBody Person p) {
//        System.out.println("p = " + p);
//        p.setName("ABC");
//        p.setAge(p.getAge() + 10);
//
//        return p;
//    }
//}