<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Test_UserApp.UserBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Profile Page</title>
</head>
<body>
 <%
String fName = (String)request.getAttribute("name");
UserBean ub = (UserBean)application.getAttribute("ubean");
out.println("Page belongs to : " + fName + "<br>");
out.println(ub.getfName() + "&nbsp;&nbsp;" + ub.getlName() + "&nbsp;&nbsp;" + 
    ub.getAddr() + "&nbsp;&nbsp;" + ub.getmId() + "&nbsp;&nbsp;" + 
    ub.getPhNo() + "<a href='edit'>Edit</a><br>");
%>
<a href="logout">Logout</a>

       
</body>
</html>