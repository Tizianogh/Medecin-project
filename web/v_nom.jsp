<%-- 
    Document   : v_nom
    Created on : 15 nov. 2018, 11:36:55
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
    <center> <body>
                        <img src="styles/logo.jpg"/>

            <h3> Nom des medecins du département en question </h3>

                   <table border="1px solid">
                <th>id</th>
                <th>nom</th>
                <th>prenom</th>
                <th>adresse</th>
                <th>telephone</th>
                <th>specialite complementaire</th>

                <c:forEach var="unMed" items="${listeMed}">

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

