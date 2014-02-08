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
<script type="text/javascript">
	function init() {
		var str = '${resultStr}';
		if (str != null && str.length > 0) {
			alert(str);
		}
	}
</script>
</head>
<body onload="init();">
<form name="form1" method="POST" action="/menuInsertPage">
MenuList
	<table border="1">
		<tr>
			<th>OBJECT_ID</th>
			<th>OBJECT_NM</th>
			<th>PARENT_ID</th>
			<th>OPEN_YN</th>
			<th>SQ</th>
			<th>FILE_PATH</th>
			<th>NOTE</th>
		</tr>
<c:forEach items="${menuList}" var="item">
		<tr>
			<td>${item.OBJECT_ID}</td>
			<td>${item.OBJECT_NM}</td>
			<td>${item.PARENT_ID}</td>
			<td>${item.OPEN_YN}</td>
			<td>${item.SQ}</td>
			<td>${item.FILE_PATH}</td>
			<td>${item.NOTE}</td>
		</tr>
</c:forEach>
	</table>
</form>
</body>
</html>