package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: Software
 * @date: 2021/5/16 16:17
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class SoftwareCollegeController {

    @GetMapping("/softwareCollege")
    public String softwareCollege(){
        return "softwareCollege";
    }
}
