<%--
  Created by IntelliJ IDEA.
  User: ShenshenLuo
  Date: 2021/5/15
  Time: 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<img src="/resources/img/background.jpg" style="z-index:-1;
	opacity:1;
	position:absolute;
	width:100%;
	height:100%;" />
<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel" style="width: 80%;
    height: 60%;
    border-radius:20px;
	margin: auto;
	position: absolute;
	opacity:0.9;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
        <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="/resources/img/news_one.jpg" class="d-block w-100" alt="图片要问">
            <div class="carousel-caption d-none d-md-block">
            </div>
        </div>
        <div class="carousel-item">
            <img src="/resources/img/news_two.png" class="d-block w-100" alt="图片要问">
            <div class="carousel-caption d-none d-md-block">
            </div>
        </div>
        <div class="carousel-item">
            <img src="/resources/img/newss_three.jpg" class="d-block w-100" alt="图片要问">
            <div class="carousel-caption d-none d-md-block">
            </div>
        </div>
    </div>
</div>