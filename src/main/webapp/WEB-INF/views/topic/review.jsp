<%@ page import="edu.buaa.qd.entity.User" %>
<%@ page import="edu.buaa.qd.entity.Topic" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.buaa.qd.entity.Reply" %><%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/19
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>北京航空航天大学青岛研究院网络社区-未来青研</title>
    <link rel="icon" href="/resources/img/favicon.ico"/>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css"/>
    <script src="/resources/js/jquery.slim.min.js"></script>
    <script src="/resources/js/popper.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    Topic topic = (Topic) request.getAttribute("topic");
    List<Reply> replies = (List<Reply>) request.getAttribute("reply");
    Integer tid = topic.getTid();
    String title = topic.getTitle();
    String description = topic.getDescription();
    String content = topic.getContent();
    String username = topic.getUsername();
    String ip = topic.getIp();
    String partitions = topic.getPartitions();
    Date timeTag = topic.getTimeTag();
    request.setAttribute("topic",topic);
    request.setAttribute("user",user);
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">

    <a class="navbar-brand" href="/index"><h4><strong>未来青研 - 梦开始的地方</strong></h4></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/collegeNews?currPage=1"><strong>学院见问</strong> </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/knowledgeShare"><strong>知识分享</strong></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/technicalHelp"><strong>技术求助</strong></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-expanded="false">
                    <strong>专业分区</strong>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="/softwareCollege">软件学院</a>
                    <a class="dropdown-item" href="/integratedCircuitCollege">集成电路科学与工程学院</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="/employee">职工专区</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/practice"><strong>实习专区</strong></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/anonymous"><strong>匿名发布</strong></a>
            </li>
            <li style="margin-left: 20px">
                <form class="form-inline my-2 my-lg-0" action="/search" method="post">
                    <input class="form-control mr-sm-2" type="search" placeholder="发现你想要的知识" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
                </form>
            </li>
            <li class="nav-item" style="margin-left: 5px">
                <a class="nav-link" href="/app">下载 “未来青研”APP</a>
            </li>
        </ul>

        <%
            if (user==null){
        %>

        <div class="dropdown" style="margin-right: 5px">
            <a class="btn btn-secondary dropdown-toggle" href="/user/login" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-expanded="false">
                登录发现更多知识
            </a>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                <a class="dropdown-item" href="/user/login">登录账号</a>
                <a class="dropdown-item" href="/user/register">激活账号</a>
            </div>
        </div>

        <%
        }else {
        %>

        <div class="dropdown" style="margin-right: 5px">
            <a class="btn btn-info dropdown-toggle" role="button" data-toggle="dropdown" aria-expanded="false">
                Hello : <%=user.getNickname()%>&nbsp;&nbsp;&nbsp;
            </a>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                <a class="dropdown-item" href="/">我的空间</a>
                <a class="dropdown-item" href="/">我的主题</a>
                <a class="dropdown-item" href="/">我的私信</a>
                <a class="dropdown-item" href="/user/loginOut">退出登录</a>
            </div>
        </div>

        <%
            }
        %>
    </div>
</nav>
<div style="margin-left: 150px;margin-right: 150px;margin-top: 20px">

    <p style="text-align: center" class="h2"><strong><%=title%></></p><hr/>
    <p style="text-align: left"><%=description%></p>
    <p style="text-align: center" class="h6">发表时间：<%=timeTag%></p>
    <p style="text-align: right" class="h6">作者：<%=username%> 来自于 IP：<%=ip%></p>
    <p style="text-align: left; padding-top: 30px" class="h5"><%=content%></p><hr/>
    <p style="text-align: left;" class="h6">评论区：</p>

    <form action="/reply/<%=tid%>" method="post">
        <div class="form-row align-items-center" style="width: 100%">
            <div class="col-7">
                <input type="text" name="content"  class="form-control" placeholder="City">
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-2 ">评论</button>
            </div>
        </div>
    </form>

    <hr/>
    <ul class="list-group list-group-flush">
        <%
            for (int i = 0; i < replies.size(); i++){
                Reply reply = replies.get(i);
                String rUsername = reply.getUsername();
                String rContent = reply.getContent();
                Date rTimeTag = reply.getTimeTag();
        %>
        <li class="list-group-item"><%=rUsername%>:<%=rContent%>&nbsp;&nbsp;<%=rTimeTag%></li>
        <%
            }
        %>
    </ul>
</div>
<div style="clear: both;
    display: block;
    text-align: center;
    margin: 0px auto;

    bottom: 10px;
    width: 100%;">
    <p>©2021-2021 BUAA, Institute. All rights reserved.©2021 Qingdao Research Institute of Beihang University.</p>
</div>
</body>
