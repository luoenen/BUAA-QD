package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: TechnicalHelp
 * @date: 2021/5/16 16:11
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class TechnicalHelp {

    @GetMapping("/technicalHelp")
    public String technicalHelp(){
        return "technicalHelp";
    }
}
