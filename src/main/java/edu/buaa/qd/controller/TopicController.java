package edu.buaa.qd.controller;

import edu.buaa.qd.entity.Topic;
import edu.buaa.qd.entity.User;
import edu.buaa.qd.service.TopicService;
import edu.buaa.qd.utils.BUAAQDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: TopicController
 * @date: 2021/5/18 18:17
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class TopicController {

    private TopicService topicService;

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping("public/topic/{partitions}")
    public String topic(@PathVariable String partitions, HttpSession session){
        session.setAttribute("partition",partitions);
        return "topic/topic";
    }

    @PostMapping("public/topic/{partitions}")
    public String publicTopic(@PathVariable String partitions, HttpServletRequest request,HttpSession session){

        User user = (User) session.getAttribute("user");
        if (user == null){
            return "user/login";
        }
        int maxId = topicService.findMaxTid(partitions);
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String content = request.getParameter("content");
        if (title == null || description == null || content == null){
            request.setAttribute("msg","发表主题信息未完整，请重新发表！");
            return "error/error";
        }
        Integer id = maxId + 1;
        Integer tid = maxId + 1;
        Integer uid = user.getUid();
        String username = user.getUsername();
        String ip = BUAAQDUtils.getIp(request);
        Date timeTag = new Date();
        Topic topic = new Topic(id,tid,title,description,content,uid,username,ip,partitions,timeTag);

        try {
            topicService.addTopic(topic);
        }catch (Exception e){
            request.setAttribute("msg",e);
            return "error/error";
        }

        return "topic/topic";
    }
}
