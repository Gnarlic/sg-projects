<%-- 
    Document   : result
    Created on : Jun 28, 2018, 9:11:23 PM
    Author     : Elnic
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lucky Sevens</title>
    </head>
    <body>
        <h1>Result</h1>
        <p>
            You bet $${moneyToBet}
        </p>
        <p>
            You are broke after ${rollCount} rolls.
        </p>
        <p>
            You should have quit after ${rollCountHighWinnings} rolls when you had $${highestWinnings}.
        </p>
        <p>
            <a href='index.jsp'>Play Again!</a>
        </p>
    </body>
</html>
