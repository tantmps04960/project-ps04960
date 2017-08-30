<%-- 
    Document   : index
    Created on : May 30, 2017, 1:44:43 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản trị</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/mos-css/mos-style.css" rel='stylesheet' type='text/css' />
        
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include>
            <jsp:include page="content.jsp"></jsp:include>

            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
