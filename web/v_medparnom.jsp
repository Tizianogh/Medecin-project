<%-- 
    Document   : v_medparnom
    Created on : 22 nov. 2018, 11:30:41
    Author     : sio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="styles/styles.css">
        <title>Medecin par nom</title>
    </head>
    <center><body>
                        <img src="styles/logo.jpg"/>

            <h3>Chercher un medecin par son nom</h3>
            <form action="control?uc=medparDep&action=listemed" method="POST" name="medparnom">
                <p>
                    <input type="text" name="medparnom" placeholder='Nom du medecin..' />
                    <input type='submit' value='Valider'/>
                </p>





            </form>
        </body></center>
</html>
