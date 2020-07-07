<%-- 
    Document   : v_listespe
    Created on : 28 nov. 2018, 10:19:31
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

            <h3>Les médecins par spe</h3>

                <table border="1px solid">
                <th>id</th>
                <th>nom</th>
                <th>prenom</th>
                <th>adresse</th>
                <th>telephone</th>
                

                <c:forEach var="unMed" items="${medparnom}">

                    <tr>
                        <td>  ${unMed.id}</td>
                        <td>  ${unMed.nom}</td>
                        <td>  ${unMed.prenom}</td>
                        <td>  ${unMed.adresse}</td>
                        <td>  ${unMed.tel}</td>
                        <td>  ${unMed.spe}</td>



                    </tr>





                </c:forEach> 

            </table>

        </body></center>
</html>
