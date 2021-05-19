package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: AppController
 * @date: 2021/5/16 16:27
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class AppController {

    @GetMapping("/app")
    public String app(){
        return "app";
    }
}
