<%-- 
    Document   : index
    Created on : 8-mrt-2014, 13:25:54
    Author     : Arix
--%>


<%@page import="io.bitcode.Constants"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/default.css" />
        <title>Bitcode Landing Page</title>
    </head>
    <body>
        <%@ include file="components/header.jsp" %>
        <%@ include file="components/menu.jsp" %>
        <div class="outer-container">
            <div class="inner-container">
                <%
                    session.invalidate();
                    if (!(boolean)Constants.MAINTENANCE_MODE) {
                %>
                <div class="container big-left-container">

                </div>

                <div class="container small-right-container">

                </div>
                <div class="container small-right-container">

                </div>
                <%
                    }
                %>
            </div>

        </div>
            
            <script src="js.js"></script>
    </body>
</html>
