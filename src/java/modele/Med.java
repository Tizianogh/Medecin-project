/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author sio
 */
public class Med implements Comparable<Med> {

    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String spe;
    private String id;
    private String dep;

    public Med(String nom, String prenom, String adresse, String tel, String spe, String id, String dep) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.spe = spe;
        this.id = id;
        this.dep = dep;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpe() {
        return spe;
    }

    public String getTel() {
        return tel;
    }

    public int compareTo(Med o) {
        if (nom.compareTo(o.nom) == 0) {

            return id.compareTo(o.id);
        } else {

            return nom.compareTo(o.nom);
        }

    }

    public String getDep() {
        return dep;
    }

}
