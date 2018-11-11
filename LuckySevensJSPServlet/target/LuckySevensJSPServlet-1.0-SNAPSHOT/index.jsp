<%-- 
    Document   : index
    Created on : Jun 28, 2018, 9:10:29 PM
    Author     : Elnic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lucky Sevens</title>
    </head>
    <body>
        <h1>Let's Play Lucky Sevens!</h1>
        <p>
            Please enter the amount of money you would like to bet:
        </p>
        <form method="post" action='LuckySevensServlet'>
            <input type="number" name='moneyToBet'/><br/>
            <input type="submit" value="Let's Play!"/>
        </form>
    </body>
</html>
