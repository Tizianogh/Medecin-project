/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sio
 */
public class Connect {          //singleton

    private static Connection con = null;

    private static Connection open() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Pilote          mal          installé          ..." + e);
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://sophie/medecin", "tghisotti", "linux");
        } catch (SQLException e) {
            System.out.println("Erreur          SQL          :" + e);
        }
        return con;
    }

    public static Connection get() {
        if (con == null) {          //attention          de          ne          jamais          fermer          la          connection,          sinon          ajouter
//          ||          con.isClosed()
            con = Connect.open();
        }
        return con;
    }

    public static void close() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Erreur          SQL          :" + e);
        }
    }

}
