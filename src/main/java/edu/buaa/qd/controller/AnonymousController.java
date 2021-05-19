package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: AnonymousController
 * @date: 2021/5/16 16:24
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class AnonymousController {
    @GetMapping("/anonymous")
    public String anonymous(){
        return "anonymous";
    }
}
