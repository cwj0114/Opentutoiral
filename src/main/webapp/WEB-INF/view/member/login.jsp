<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login page</title>
<script type="text/javascript"
	src="<c:url value="/static/js/jquery-3.3.1.min.js"/>"></script>
<script type="text/javascript">
	$().ready(function() {
		$("#loginBtn").click(function() {
			$("#loginForm").attr({
				"action" : "<c:url value = "/login"/>",
				"method" : "post"
			}).submit();
		});
	});
</script>
</head>
<body>
	<div id="wrapper" style="text-align: center; border: 1px solid; height: 250px; width: 175px; background-color: #EEE;">
		<form:form modelAttribute="loginForm">
			<br/>
			<br/>
			<div>
				<input type="text" id="email" name="email" placeholder="계정" />
			</div>
			<br/>
			<div>
				<input type="password" id="password" name="password" placeholder="비밀번호" />
			</div>
			<div style="font-size: 8px; text-align: right; margin-right: 22px;">
				<input type="checkbox" />로그인 상태유지
			</div>
			<br/>
			<br/>
			<div>
				<input type="button" id="loginBtn" value="로그인" />
			</div>
			<br/>
			<div>
				<a href="<c:url value="/regist"/>">
					<input type="button" id="registBtn" value="회원가입" /><!--
			--></a>
			 	<input type="button" id="findBtn" value="계정찾기" />
			</div>
		</form:form>
	</div>
</body>
</html>