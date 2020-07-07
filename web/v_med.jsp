<%-- 
    Document   : vuemed
    Created on : 13 nov. 2018, 16:32:00
    Author     : sio
--%>

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
            <h1>Navigation GSB</h1>
            <div id="menugauche">
                <ul id="menuList">
                    <li class="smenu"> <a href='control?uc=medparDep&action=choixdep'>Medecins par dep</a><br/></li>
                    <li class="smenu"> <a href='control?uc=medparDep&action=mednom'>Medecins par nom</a><br/></li>
                    <li class="smenu"> <a href='control?uc=medparDep&action=medspe'>Medecins par spe</a></li>
                </ul>
            </div>
        </body></center>
</html>
