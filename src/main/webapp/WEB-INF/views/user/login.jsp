<%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/15
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="/index">未来青研</a></li>
        <li class="breadcrumb-item active" aria-current="page">账号登录</li>
    </ol>
</nav>
<div style="margin-top: 40px;margin-left: 300px;margin-right: 300px">
    <form method="post" action="/user/login">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label>学号/职工号</label>
                <input type="text" class="form-control" name="account" placeholder="请输入学号/职工号">
            </div>
            <div class="form-group col-md-6">
                <label>密码</label>
                <input type="password" class="form-control" name="password" placeholder="请输入密码">
            </div>
        </div>
        <div class="form-group">
            <label>UUID（在个人空间里查看 可作为登录私钥直接登录）</label>
            <input type="password" class="form-control" name="uuid" placeholder="请输入私钥 UUID">
        </div>
        <div class="form-group">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="gridCheck">
                <label class="form-check-label" for="gridCheck">
                    保存登录信息
                </label>
            </div>
        </div>
        <div>
            <input type="submit" class="btn btn-primary col-md-5" value="登录社区"/>
            <dev style="float: right"  class="btn btn-primary col-md-5" onclick="toRegister()">激活账号</dev>
        </div>
    </form>
</div>

<script type="text/javascript">
    function toRegister(){
        window.location.href="http://127.0.0.1:8080/user/register"
    }
</script>
