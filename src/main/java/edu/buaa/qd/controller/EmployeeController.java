package edu.buaa.qd.controller;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: EmployeeController
 * @date: 2021/5/16 16:21
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String employee(){
        return "employee";
    }
}
