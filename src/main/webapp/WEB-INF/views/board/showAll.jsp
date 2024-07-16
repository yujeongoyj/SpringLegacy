<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>게시글 목록을 보여주는 중....</h1>
<sec:authentication property="principal" var="principal"/>
${principal}
<sec:authorize access="hasRole('ROLE_ADMIN')">
    관리자님 안녕하세요!
</sec:authorize>
<sec:authorize access="hasRole('ROLE_USER')">
    사용자님 안녕하세요!
</sec:authorize>
<form action="/logOut" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <input type="submit" value="로그아웃">
</form>
</body>
</html>

