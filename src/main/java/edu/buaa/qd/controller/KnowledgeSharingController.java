package edu.buaa.qd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: KnowledgeSharingController
 * @date: 2021/5/16 16:08
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class KnowledgeSharingController {

    @GetMapping("/knowledgeShare")
    public String knowledgeShare(){
        return "knowledgeShare";
    }
}
