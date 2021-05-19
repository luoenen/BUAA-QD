<%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/15
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String msg = (String) request.getAttribute("msg");
    String stateCode = (String)request.getAttribute("stateCode");
%>
<ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="#">未来青研</a></li>
    <li class="breadcrumb-item active" aria-current="page">错误页面</li>
</ol>
<h3 style="color: red;text-align: center; margin-top: 30px"><%=stateCode%></h3>
<h3 style="color: #005cbf;text-align: center; margin-top: 30px">您好，您的请求并非引起了错误页面，而是我们加入宝贝回家公益项目(五秒钟后跳转)增加走失儿童曝光率。</h3>
<b/>
<h4 style="color: #005cbf;text-align: center"><strong>错误信息：<%=msg%></strong></h4>
<script>
    setTimeout(function(){
        location='http://127.0.0.1:8080/error/child';
    },5000);
</script>
