<%-- 
    Document   : v_spe
    Created on : 28 nov. 2018, 09:42:17
    Author     : sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="styles/styles.css">
        <title>JSP Page</title>
    </head>
      <center><body>
                          <img src="styles/logo.jpg"/>

            <h3>Chercher un medecin par sa specialité</h3>
            <form action="control?uc=medparDep&action=listespe" method="POST" name="medparspe">
            
                <select name="monselect">
                    <c:forEach var="uneSpe" items="${liste}">


                        <option value="${uneSpe.nom}">${uneSpe.nom}</option>




                    </c:forEach> 


                    <input type="submit" name="check" value='Valider' />



                </select>

            




            </form>
        </body></center>
</html>
