package edu.buaa.qd.controller;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: ReviewController
 * @date: 2021/5/19 18:14
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.entity.Reply;
import edu.buaa.qd.entity.Topic;
import edu.buaa.qd.entity.User;
import edu.buaa.qd.service.ReplyService;
import edu.buaa.qd.service.TopicService;
import edu.buaa.qd.service.UserService;
import edu.buaa.qd.utils.BUAAQDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class ReviewController {

    private TopicService topicService;
    private ReplyService replyService;
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setReplyService(ReplyService replyService) {
        this.replyService = replyService;
    }

    @Autowired
    public void setTopicService(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/topic/review")
    public String review(HttpServletRequest request){

        Integer tid = Integer.parseInt(request.getParameter("tid"));
        String partitions = request.getParameter("partitions");
        Topic topic = topicService.findTopicByTidAndPartitions(tid,partitions);
        if (topic == null){
            request.setAttribute("stateCode","Forbidden 403");
            request.setAttribute("msg","服务器理解客户端的请求，但是拒绝执行此请求和响应具体内容！");
            return "error/error";
        }
        List<Reply> reply = replyService.findAllReplyForTid(tid);
        request.setAttribute("topic",topic);
        request.setAttribute("reply",reply);
        return "topic/review";
    }

    @RequestMapping("/reply/{tid}")
    public String reply(@PathVariable int tid, HttpServletRequest request){
        Topic topic = topicService.findTopicByTid(tid);
        User user = userService.findUserByUid(topic.getUid());
        if (topic == null){
            request.setAttribute("stateCode","Forbidden 403");
            request.setAttribute("msg","服务器理解客户端的请求，但是拒绝执行此请求和响应具体内容！");
            return "error/error";
        }
        Integer maxId = replyService.findMaxRid();
        Integer id = maxId + 1;
        Integer rid = maxId + 1;
        String content = request.getParameter("content");
        Integer uid = user.getUid();
        String username = user.getUsername();
        String ip = BUAAQDUtils.getIp(request);
        Date timeTag = new Date();
        Reply replyTemp = new Reply(id,rid,content,tid,uid,username,ip,timeTag);
        replyService.addReply(replyTemp);
        List<Reply> reply = replyService.findAllReplyForTid(tid);
        request.setAttribute("topic",topic);
        request.setAttribute("reply",reply);
        return "topic/review";
    }
}
