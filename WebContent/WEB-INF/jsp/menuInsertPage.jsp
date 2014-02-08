<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="form1" method="POST" action="/menuInsertPage">
	<table>
		<tr>
			<td>OBJECT_ID</td>
			<td><input type="text" name="OBJECT_ID" value="BA"></td>
		</tr>
		<tr>
			<td>OBJECT_NM</td>
			<td><input type="text" name="OBJECT_NM" value="메뉴B-A"></td>
		</tr>
		<tr>
			<td>PARENT_ID</td>
			<td><input type="text" name="PARENT_ID" value="B"></td>
		</tr>
		<tr>
			<td>OPEN_YN</td>
			<td><input type="text" name="OPEN_YN" value="Y"></td>
		</tr>
		<tr>
			<td>SQ</td>
			<td><input type="text" name="SQ" value="01"></td>
		</tr>
		<tr>
			<td>FILE_PATH</td>
			<td><input type="text" name="FILE_PATH" value="/menuSelect?object_id=BA"></td>
		</tr>
		<tr>
			<td>NOTE</td>
			<td><input type="text" name="NOTE" value=""></td>
		</tr>
	</table>
	<button onclick="document.form1.submit();">submit</button>
</form>
</body>
</html>