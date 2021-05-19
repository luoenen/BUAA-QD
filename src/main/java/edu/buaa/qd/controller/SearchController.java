package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: SearchController
 * @date: 2021/5/16 16:26
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class SearchController {

    @PostMapping("/search")
    public String search(){
        return "search";
    }
}
