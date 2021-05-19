<%@ page import="java.util.List" %>
<%@ page import="edu.buaa.qd.entity.Topic" %><%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/16
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Topic> list = (List<Topic>) request.getAttribute("data");
%>
<div style="margin-top: 20px;margin-left: 150px;margin-right: 150px">
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="/index">未来青研</a></li>
            <li class="breadcrumb-item active" aria-current="page">学院见闻</li>
            <li style="float: right" class="breadcrumb-item"><a href="/public/topic/collegeNews" class="btn btn-outline-success btn-sm">发表主题</a></li>
        </ol>
    </nav>
    <div class="list-group">
        <a href="#" class="list-group-item list-group-item-action active" aria-current="true">
            <strong>北京航空航天大学青岛研究院最新发布</strong>
        </a>

        <%
            for (int i = 0; i < list.size(); i++){
                Topic topic = list.get(i);
        %>
        <a href="/topic/review?tid=<%=topic.getTid()%>&partitions=<%=topic.getPartitions()%>" class="list-group-item list-group-item-action"><strong><%=topic.getTitle()%></strong></a>
        <%
            }
        %>
    </div>

    <nav aria-label="Page navigation example" style="margin-top: 10px">
        <ul class="pagination justify-content-end">
            <li class="page-item">
                <a class="page-link" href="#" tabindex="-1">上一页</a>
            </li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item">
                <a class="page-link" href="#">下一页</a>
            </li>
        </ul>
    </nav>
</div>
