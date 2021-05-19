<%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/15
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
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
<body style="overflow-x: hidden;overflow-y: hidden;">
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="main"/>
    <div>
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
