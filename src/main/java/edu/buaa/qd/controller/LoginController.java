package edu.buaa.qd.controller;

import edu.buaa.qd.entity.User;
import edu.buaa.qd.service.UserService;
import edu.buaa.qd.utils.BUAAQDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: LoginController
 * @date: 2021/5/15 10:47
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user/login")
    public String loginPage(){
        return "user/login";
    }

    @PostMapping("/user/login")
    public String login(User user, HttpServletRequest request, HttpSession session){

        String account = user.getAccount();
        String password = user.getPassword();
        String uuid = user.getUuid();

        /*
        开始登录
         */
        if (!user.getAccount().equals("")&&!user.getPassword().equals("")){
            User tempUser = userService.findUserByAccount(account);
            if (tempUser==null){
                request.setAttribute("msg","账号密码或UUID输入错误，请确认无误后重新登录");
                return "error/error";
            }
            if (tempUser.getPassword().equals(password) || tempUser.getUuid().equals(uuid)){
                user.setOnline(String.valueOf(BUAAQDUtils.state.在线));
                session.setAttribute("user",tempUser);
                return "user/home";
            }else {
                request.setAttribute("msg","账号密码或UUID输入错误，请确认无误后重新登录");
                return "error/error";
            }
        }

        /*
        以用户uuid进行登录
         */
        if (!user.getUuid().equals("")){

            User tempUser = userService.findUserByUuid(uuid);
            if (tempUser!=null){
                request.setAttribute("user",tempUser);
                return "user/home";
            }else {
                request.setAttribute("msg","UUID输入错误，请确认无误后重新登录");
                return "error/error";
            }
        }

        /*
        不允许user登录
         */
        if (user.getAccount().equals("")||user.getPassword().equals("")){
            request.setAttribute("msg","账号信息填写不完整，需要重新输入账号密码或者UUID私钥进行登录");
            return "error/error";
        }

        return "index";
    }

    @GetMapping("/user/loginOut")
    public String loginOut(HttpSession session){
        User user = (User) session.getAttribute("user");
        user.setOnline(String.valueOf(BUAAQDUtils.state.离线));
        session.invalidate();
        return "user/login";
    }
}
