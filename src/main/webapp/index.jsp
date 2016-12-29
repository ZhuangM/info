<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息系统V1.0</title>
</head>
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
</body>
</html>