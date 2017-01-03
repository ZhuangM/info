<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>信息系统v1.0</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="jquery/jquery-1.12.0.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<<<<<<< HEAD
<body
	style="background-image: images/login.png; background-position: center; background-repeat: repeat-y">
	<div>
		<div>welcome</div>
	</div>
=======
<body>
	<center>
		<form action="user/login" method="post">
			<table>
				<tr>
					<td><label>用户名: </label></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><label>密码: </label></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><label>身份: </label></td>
					<td><label><input type="checkbox" name="role"
							value="0" checked="checked">用户</label>&nbsp;<label><input
							type="checkbox" name="role" value="1">管理员</label></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="登录">&nbsp;<input
						type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>
>>>>>>> 880a6a47d52f4647baad85a74d65eabf237f8752
</body>
</html>