package edu.buaa.qd.controller;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: IntegratedCircuitCollegeController
 * @date: 2021/5/16 16:19
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IntegratedCircuitCollegeController {

    @GetMapping("/integratedCircuitCollege")
    public String integratedCircuitCollege(){
        return "integratedCircuitCollege";
    }
}
