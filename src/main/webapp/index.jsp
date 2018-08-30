<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style>
.all {
	width: 100%;
	height: 1000px;
	background: url(images/all.png) no-repeat;
}

.nav {
	width: 150px;
	height: 205px;
	background: black;
	position: fixed;
	top: 200px;
	left: 0px;
	font-family: 'Miscrosoft YaHei';
}

.menu {
	width: 150px;
	height: auto;
	background: #333;
	border-bottom: 1px solid white;
	text-align: center;
	line-height: 40px;
	color: #fff;
	font-size: 16px;
}

.title {
	width: 150px;
	height: 40px;
}

.menu ul {
	width: 150px;
	height: auto;
	background: #fff;
	display: none;
}

.menu:hover  ul {
	display: block;
}

.menu ul li {
	width: 150px;
	height: 30px;
	color: #999;
	border-bottom: 1px dashed #666;
	text-align: center;
	line-height: 30px;
	font-size: 13px;
	margin: 0;
	padding: 0;
	list-style: none;
}

ul {
	margin: 0;
	padding: 0;
}

.second {
	width: 150px;
	height: 30px;
}

.third ul li{
	width: 150px;
	height: 30px;
	background: #763;
	position: fixed;
	left: 150px;
	dispaly:none;
}

.third:hover ul{
dispaly:block;
}
</style>
</head>

<body>
	<div class="all" />
	<div class="nav">
		<div class="menu">
			<div class="title">一级菜单</div>
			<ul>
				<li>
					<div class="second">二级菜单</div>
					<div class="third">
						<ul>
							<li>三级菜单</li>
							<li>三级菜单</li>
						</ul>
					</div>
				</li>
				<li>二级菜单</li>
				<li>二级菜单</li>
			</ul>
		</div>
		<div class="menu">
			<div class="title">一级菜单</div>
			<ul>
				<li>二级菜单</li>
				<li>二级菜单</li>
				<li>二级菜单</li>
			</ul>
		</div>
		<div class="menu">
			<div class="title">一级菜单</div>
			<ul>
				<li>二级菜单</li>
				<li>二级菜单</li>
				<li>二级菜单</li>
			</ul>
		</div>
		<div class="menu">
			<div class="title">一级菜单</div>
			<ul>
				<li>二级菜单</li>
				<li>二级菜单</li>
				<li>二级菜单</li>
			</ul>
		</div>
		<div class="menu">
			<div class="title">一级菜单</div>
			<ul>
				<li>二级菜单</li>
				<li>二级菜单</li>
				<li>二级菜单</li>
			</ul>
		</div>
	</div>
</body>
</html>