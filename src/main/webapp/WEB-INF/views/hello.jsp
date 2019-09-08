<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello page</title>
</head>
<body>
 ID     :  <%=request.getAttribute("id")%><br/>
 Name   :  <%=request.getAttribute("name")%> <br/>
 Salary : <%=request.getAttribute("salary")%>
 <br/>
  ID     :  ${id}<br/>
 Name   :  ${name} <br/>
 Salary : ${salary}
</body>
</html>