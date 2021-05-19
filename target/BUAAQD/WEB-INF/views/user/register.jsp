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
        <li class="breadcrumb-item active" aria-current="page">账号激活</li>
    </ol>
</nav>
<div style="margin-top: 40px;margin-left: 300px;margin-right: 300px">
    <form method="post" action="/user/register">
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
        <div class="form-row">
            <div class="form-group col-md-6">
                <label >姓名</label>
                <input type="text" class="form-control" name="username" placeholder="请输入真实姓名">
            </div>
            <div class="form-group col-md-6">
                <label>昵称</label>
                <input type="text" class="form-control" name="nickname" placeholder="请输入社区昵称">
            </div>
        </div>
        <div class="form-group">
            <label>实习部门</label>
            <input type="text" class="form-control" name="department" placeholder="请输入实习部门">
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label>微信</label>
                <input type="text" class="form-control" name="wechat" placeholder="请输入联系方式">
            </div>
            <div class="form-group col-md-4">
                <label >学院/企业</label>
                <select name="college" class="form-control">
                    <option value="1" selected>软件学院</option>
                    <option value="2">集成电路科学与工程学院</option>
                    <option value="3">青岛小鸟看看 Pico</option>
                </select>
            </div>
            <div class="form-group col-md-4">
                <label>专业</label>
                <input type="text" class="form-control" name="professional" placeholder="请输入专业方向">
            </div>
        </div>
        <div>
            <input  type="submit" class="btn btn-primary col-md-12" value="激活账号"/>
        </div>
    </form>
</div>
