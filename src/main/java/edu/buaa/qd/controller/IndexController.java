package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: IndexController
 * @date: 2021/5/14 22:34
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
@RequestMapping(value = {"/","/index","home"})
public class IndexController {

    @GetMapping()
    public String index(){
        return "index";
    }
}
