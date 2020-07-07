
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author sio
 */
public class DAO {

    static Collection<Dep> getLesDeps() {
        try {
            Collection<Dep> lesDeps = new TreeSet<Dep>();
            Connection con = Connect.get();
            Statement reqDep;
            reqDep = con.createStatement();
            ResultSet rsDep = reqDep.executeQuery("select distinct departement from medecin");
            boolean encore = rsDep.next();
            while (encore) {
//                Collection<Med> lesMeds = getLesMeds(rsDep.getString("departement"));
                Dep d = new Dep(rsDep.getString("departement"));
                lesDeps.add(d);
                encore = rsDep.next();
            }
            rsDep.close();
            return lesDeps;
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e);
            System.exit(-1);

        }
        return null;

    }

    public static Collection<Med> getLesMeds() {
        try {
            Collection<Med> lesMeds = new TreeSet<Med>();
            Connection con = Connect.get();
            Statement reqMed;
            reqMed = con.createStatement();
            ResultSet rsMed = reqMed.executeQuery("select * from medecin");
            boolean encore = rsMed.next();
            while (encore) {
                Med m = new Med(rsMed.getString("nom"), rsMed.getString("prenom"), rsMed.getString("adresse"), rsMed.getString("tel"), rsMed.getString("specialitecomplementaire"),
                        rsMed.getString("id"), rsMed.getString("departement"));
                lesMeds.add(m);
                encore = rsMed.next();
            }
            rsMed.close();
            return lesMeds;

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e);
            System.exit(-1);
        }
        return null;
    }

    public static Collection<Spe> getLesSpes() {
        try {
            Collection<Spe> lesSpes = new TreeSet<Spe>();
            Connection con = Connect.get();
            Statement reqSpe;
            reqSpe = con.createStatement();
            ResultSet rsSpe = reqSpe.executeQuery("select distinct specialitecomplementaire from medecin where specialitecomplementaire is not null");
            boolean encore = rsSpe.next();
            while (encore) {
                Spe s = new Spe(rsSpe.getString("specialitecomplementaire"));
                lesSpes.add(s);
                encore = rsSpe.next();
            }
            rsSpe.close();
            return lesSpes;

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e);
            System.exit(-1);
        }
        return null;
    }
}
