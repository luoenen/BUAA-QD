package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: ErrorController
 * @date: 2021/5/16 11:47
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class ErrorController {

    @RequestMapping("/error/error")
    public String error(){
        return "error/error";
    }

    @RequestMapping("/error/child")
    public String child(){
        return "error/child";
    }
}
