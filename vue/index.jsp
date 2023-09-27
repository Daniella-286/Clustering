<%-- 
    Document   : hello
    Created on : 27 sept. 2023, 11:23:40
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="get" action="http://localhost:8080/Cluster/helloworld">
            <p> Nom : <input type="text" name="nom"> </p>
            <input type="submit" >
        </form>
        <p name="paragraph"> </p>
    </body>
</html>
