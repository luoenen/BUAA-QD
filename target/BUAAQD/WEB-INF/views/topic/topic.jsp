<%@ page import="edu.buaa.qd.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/18
  Time: 18:18
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
    <script src="/resources/js/wangEditor.min.js"></script>
</head>
<body>
<%
    String partition = (String) session.getAttribute("partition");
    User user = (User) session.getAttribute("user");
    session.setAttribute("user",user);
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

<div style="margin-left: 200px;margin-right: 200px;margin-top: 20px;padding: 20px">
    <form method="post" action="/public/topic/<%=partition%>">
        <div class="input-group">
            <input type="text" name="title" placeholder="输入主题标题" class="form-control" aria-label="Text input with dropdown button">
            <div class="input-group-append">
                <button class="btn btn-outline-secondary dropdown-toggle" type="button" data-toggle="dropdown"
                        aria-expanded="false">操作</button>
                <div class="dropdown-menu">
                    <button onclick="publish()" class="dropdown-item">发表</button>
                    <a class="dropdown-item" href="#">废弃</a>
                    <a class="dropdown-item" href="#">返回</a>
                </div>
            </div>
        </div>
        <div class="input-group mb-3" style="margin-top: 20px">
            <input type="text" name="description" class="form-control" placeholder="输入主题描述" aria-label="Recipient's username" aria-describedby="button-addon2">
            <textarea name="content" id="content" style="width:100%; height:200px;display:none" ></textarea>
        </div>

        <div id="div" style="margin-top: 70px;">
        </div>

    </form>
</div>

<script type="text/javascript">
    const E = window.wangEditor
    const editor = new E( document.getElementById('div') )
    editor.create()

    function publish(){
        var text = editor.txt.text()
        $("#content").text(text);
    }

</script>

<div style="clear: both;
    display: block;
    text-align: center;
    margin: 0px auto;
    position: absolute;
    bottom: 10px;
    width: 100%;">
    <p>©2021-2021 BUAA, Institute. All rights reserved.©2021 Qingdao Research Institute of Beihang University.</p>
</div>
</body>
</html>
