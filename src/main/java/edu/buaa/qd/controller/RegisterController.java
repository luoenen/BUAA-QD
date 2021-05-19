package edu.buaa.qd.controller;

import edu.buaa.qd.entity.User;
import edu.buaa.qd.service.UserService;
import edu.buaa.qd.utils.BUAAQDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: RegisterController
 * @date: 2021/5/16 11:41
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class RegisterController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user/register")
    public String registerPage(){

        return "user/register";
    }

    @RequestMapping(value = "/user/register",method = RequestMethod.POST)
    public String register(User user, HttpServletRequest request, HttpSession session){

        if(user.getAccount().equals("")||user.getPassword().equals("")||user.getNickname().equals("")||
                user.getUsername().equals("")||user.getCollege().equals("")||user.getProfessional().equals("")||
                user.getWechat().equals("")||user.getDepartment().equals("")){
            request.setAttribute("msg","激活账号的信息输入不完整，不符合社区规范，请重新填写！");
            return "error/error";
        }
        String userNickname = userService.findNicknameByAccount(user.getAccount());
        if (userNickname != null){
            request.setAttribute("msg","很遗憾，该账号已经激活使用，账号使用人社区昵称为："+userNickname+"！");
            return "error/error";
        }

        switch (user.getCollege()){
            case "1":
                user.setCollege(String.valueOf(BUAAQDUtils.college.软件学院));
                break;
            case "2":
                user.setCollege(String.valueOf(BUAAQDUtils.college.集成电路科学与工程学院));
                break;
            case "3":
                user.setCollege(String.valueOf(BUAAQDUtils.college.Pico青岛小鸟看看));
                break;
        }
        int maxUid = userService.findMaxUid();
        int id = maxUid+1;
        int uid = maxUid+1;
        String uuid = UUID.randomUUID().toString();
        Date timeTag = new Date();
        String ip = BUAAQDUtils.getIp(request);
        String online = String.valueOf(BUAAQDUtils.state.在线);
        user.setId(id);
        user.setUid(uid);
        user.setUuid(uuid);
        user.setTimeTag(timeTag);
        user.setOnline(online);
        user.setIp(ip);
        System.out.println(user);
        try {
            userService.addUser(user);
        }catch (Exception e){
            request.setAttribute("msg",e);
            return "error/error";
        }
        session.setAttribute("user",user);
        return "user/home";
    }
}
