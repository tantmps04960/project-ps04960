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
                <div id="rightContent">
                    <h3>${webName}</h3>
                    <div class="quoteOfDay">
                        <b>Quote of the day :</b><br>
                        <i style="color: #5b5b5b;">"If you think you can, you really can"</i>
                    </div>
                    
                </div>

            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
