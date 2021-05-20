<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<sql:query var="rs" dataSource="jdbc/Spring">
select id,name,password from user;
</sql:query>

<html>
<head>
<title>DB Test</title>
</head>
<body>
	<h2>Results</h2>

<c:forEach var="row" items="${rs.rows}">
  User name : ${name}  <br/>
  password  : ${row.password}<br/>
  id 		: ${row.id} <br/>
</c:forEach>
</body>
</html>