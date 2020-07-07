/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author sio
 */
public class Spe implements Comparable<Spe> {

    private String nom;
    private Collection<Med> lesMeds = new TreeSet<>();
   

    public Spe(String nom) {
        this.nom = nom;
        this.lesMeds = lesMeds;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }

    public String getNom() {
        return nom;
    }

    void addUnMed(Med unMed) {
        lesMeds.add(unMed);
    }

    @Override
    public int compareTo(Spe o) {
    return nom.compareTo(o.nom);    }

}
