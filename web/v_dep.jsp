<%-- 
    Document   : v_dep
    Created on : 13 nov. 2018, 17:08:29
    Author     : sio
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/styles.css">
        <title>JSP Page</title>
    </head>
    <center><body>
            <img src="styles/logo.jpg"/>

            <h3> Les numéros des départements</h3>
            <form action="control?uc=medparDep&action=choixnom" method="POST" name="form">
                <select name="monselect">
                    <c:forEach var="unDep" items="${liste}">


                        <option value="${unDep.num}">${unDep.num}</option>




                    </c:forEach> 


                    <input type="submit" name="check" value='Valider' />



                </select>

            </form>
        </body></center>
</html>
