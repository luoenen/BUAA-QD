package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: PracticeController
 * @date: 2021/5/16 16:22
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class PracticeController {

    @GetMapping("/practice")
    public String practice(){
        return "practice";
    }
}
