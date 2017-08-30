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
         <style>
            table{
                border-collapse: collapse;
                width: 100%;
            }
            th,td{
                line-height: 25px;
                border: 1px solid black;
                padding: 5px;
                
            }
            th{
                background-color: gray;
            }
        </style>
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
                    <table>

                        <thead>
                        <th>STT</th>
                        <th>Name</th>
                        <th>Salary</th>
                        <th>Gender</th>
                        <th>Birthday</th>
                        <th>Email</th>
                        <th>Department</th>
                        <th></th>
                        <th></th>
                        </thead>
                        <tbody>

                      <c:forEach var="emp" items="${empre}">
                        <form action="employee/delete.htm">
                            <tr>
                                <td>${emp.employeeId}</td>
                                <td>${emp.name}</td>
                                <td>${emp.salary}</td>
                                <td>${emp.gender}</td>
                                <td>${emp.birthday}</td>
                                <td>${emp.email}</td>
                                <td>${emp.department.getDepName()}</td>



                                <td><a href="employee/edit.htm">Edit</a></td>
                                <td>
                                    <input type="hidden" name="txtEmployeeID" value="${emp.employeeId}"/>
                                    <input class="btn" type="submit" name="action" value="Delete"/>
                                </td>
                            </tr>
                        </form>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
