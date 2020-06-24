<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta name="viewport" content="width= device-width", initial-scale="1">

<link rel="stylesheet" href="css/bootstrap.css">

<title>JSP 게시판 웹 사이트</title>
<style>
a {
    position:relative;
    display:inline-block;
    padding:15px 30px;
    color:white;
    text-transform:uppercase;
    letter-spacing:4px;
    text-decoration:none;
    font-size:24px;
    overflow:hidden;
    transition:0.2s;
    text-align: center;
}
a:hover {
    color: #255784;
    background:#2196f3;
    box-shadow: 0 0 10px #2196f3, 0 0 40px #2196f3,
    0 0 80px #2196f3;
    transition-delay: 1s;
}
a span {
    position: absolute;
    display: block;
}
a span:nth-child(1) {
    top: 0;
    left: -100%;
    width: 100%;
    height: 2px;
    background:linear-gradient(90deg,transparent,#2196f3);
}
a:hover span:nth-child(1) {
    left: 100%;
    transition: 1s;
}
a span:nth-child(3) {
    bottom: 0;
    right: -100%;
    width: 100%;
    height: 2px;
    background:linear-gradient(270deg,transparent,#2196f3);
}
a:hover span:nth-child(3) {
    right: 100%;
    transition: 1s;
    transition-delay: 0.5s;
}
a span:nth-child(2) {
    top: -100%;
    right: 0;
    width: 2px;
    height: 100%;
    background:linear-gradient(180deg,transparent,#2196f3);
}
a:hover span:nth-child(2) {
    top: 100%;
    transition: 1s;
    transition-delay: 0.25s;
}
a span:nth-child(4) {
    bottom: -100%;
    left: 0;
    width: 2px;
    height: 100%;
    background:linear-gradient(360deg,transparent,#2196f3);
}
a:hover span:nth-child(4) {
    top: 100%;
    transition: 1s;
    transition-delay: 0.75s;
}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<div class ="navbar-header"> 

			<!-- 햄버거 모양 -->

			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" 

			data-target="#bs-example-navbar-collapse-1"aria-expanded="false">

			<span class ="icon-bar"></span>

			<span class ="icon-bar"></span>

			<span class ="icon-bar"></span>

			</button>

			<a class="navbar-brand"href="main.jsp">JSP웹사이트 게시판</a>

		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

			<ul class="nav navbar-nav">

				<li><a href="main.jsp">메인</a></li>

				<li><a href="bbs.jsp">게시판</a></li>

			</ul>

			<ul class="nav navbar-nav navbar-right">

			<li class="dropdown">

				<a href="#" class="dropdown-toggle" data-toggle="dropdown" 

				role="button" aria-haspopup="true" aria-expanded="false">

				접속하기<span class="caret"></span></a>

				<!-- 로그인과 회원가입 -->

					<ul class="dropdown-menu">

						<li class="active"><a href="login.jsp">로그인</a></li>

						<li><a href="join.jsp">회원가입</a></li>

					</ul>

			</li>

			</ul>

		</div>

	</nav>



	<div class="container">
		<!-- 감싸기 -->

		<div class="col-lg-4"></div>

		<div class="col-lg-4">



			<div class="jumbotron" style="padding-top: 20px;">

				<form method="post" action="loginAction.jsp">

					<!-- 안보이게 접속 -->

					<h3 style="text-align:center;">로그인 화면</h3>

					<div class="form-group">

						<input type="text" 
							   class="form-control" 
							   placeholder="아이디"
							   name="userID" 
							   maxlength="20">

					</div>

					<div class="form-group">

						<input  type="password" 
								class="form-control" 
								placeholder="비밀번호"
								name="userPassword" 
								maxlength="20">

					</div>
<a href = "#">
    <span></span>
    <span></span>
    <span></span>
    <span></span>
	로그인
</a>
				</form>

			</div>

		</div>

		<div class="col-lg-4"></div>

	</div>



	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

	<script src="js/bootstrap.js"></script>

</body>

</html>
