<%@ page import="edu.buaa.qd.entity.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/15
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User) session.getAttribute("user");
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
