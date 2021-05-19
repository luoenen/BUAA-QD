package edu.buaa.qd.controller;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: HomeController
 * @date: 2021/5/17 20:53
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/user/home")
    public String home(){
        return "user/home";
    }
}
