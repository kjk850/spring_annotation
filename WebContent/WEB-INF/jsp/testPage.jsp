<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
 .ui-dialog .ui-dialog-titlebar-close { display: none; position: absolute; right: .3em; top: 50%; width: 19px; margin: -10px 0 0 0; padding: 1px; height: 18px; }
 </style>
<script type="text/javascript" src="/resources/js/jquery-1.9.1.js"></script>
<script>
	function moveCheckYn() {
		event.returnValue = "창닫을래??";
	}
	
	function modalDialog() {
		openWindowStyle = "dialogWidth:500px;dialogHeight:500px; edge: Sunken; center: Yes; help: No; resizable: No; status: No; dialogClass:no-close; "
		openWindowObject = window.showModalDialog("/popPage", window , openWindowStyle);

		window.showModalDialog();
	}
</script>
</head>
<body onload="">
Menu<br>
id:${menu.OBJECT_ID}<br>
nm:${menu.OBJECT_NM}<br>
pa:${menu.PARENT_ID}<br><br>

MenuFromVO<br>
id:${menuFromVO.OBJECT_ID}<br>
nm:${menuFromVO.OBJECT_NM}<br>
pa:${menuFromVO.PARENT_ID}<br><br>

MenuList
<c:forEach items="${menuList}" var="item">
	id[${item.OBJECT_ID}] <br>
	nm[${item.OBJECT_NM}] <br>
	pa[${item.PARENT_ID}] <br><br>
</c:forEach>
</body>
</html>
