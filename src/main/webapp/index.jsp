<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<link href="css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Web-Fonts -->
<link href='//fonts.googleapis.com/css?family=Poiret+One'
	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Play:700' rel='stylesheet'
	type='text/css'>
<!-- Web-Fonts end here -->
</head>
<body>
	<div class="header">
		<h1>Staff Login Form</h1>
	</div>
	<div class="content">
		<div class="content1">
			<h1>LOGIN</h1>
		</div>
		<div class="content2">
			<form action="user/login" method="post">
				<input type="text" name="username" value="USERNAME"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'USERNAME';}">
				<input type="password" name="password" value="PASSWORD"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'PASSWORD';}">
				<input type="submit" value="Login">
			</form>
		</div>
	</div>
	<div class="footer">
		<p>
			Copyright © 2016 Staff Login Form. All Rights Reserved | Design by <a
				href="https://w3layouts.com/" target="_blank">w3layouts</a>
		</p>
	</div>
</body>
</html>