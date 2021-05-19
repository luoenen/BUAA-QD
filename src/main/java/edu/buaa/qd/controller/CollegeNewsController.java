package edu.buaa.qd.controller;

import edu.buaa.qd.dao.TopicDao;
import edu.buaa.qd.entity.Topic;
import edu.buaa.qd.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: CollegeNewsController
 * @date: 2021/5/16 16:04
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class CollegeNewsController {

    private TopicService topicService;

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/{collegeNews}")
    public String collegeNews(@PathVariable String collegeNews, HttpServletRequest request){

        String currPage = request.getParameter("currPage");
        int totalRecord = topicService.findSizeRecord(collegeNews);
        int totalPageNum = (totalRecord + 8) / 9;

        if (Integer.parseInt(currPage) > totalPageNum){
            request.setAttribute("msg","查看页数超出数据总量或者行为不规范");
            return "error/error";
        }
        List<Topic> list = topicService.findTopicPage(collegeNews,(Integer.parseInt(currPage)-1)*9,9);
        request.setAttribute("data",list);
        return "collegeNews";
    }
}
