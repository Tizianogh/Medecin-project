/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;

/**
 *
 * @author sio
 */
public class Pays {

    private Collection<Dep> lesDeps;
    private Collection<Spe> lesSpecs;

    public Pays() {

        lesDeps = DAO.getLesDeps();
        lesSpecs = DAO.getLesSpes();
        this.assocMedecins(DAO.getLesMeds());

    }

    private void assocMedecins(Collection<Med> lesMeds) {
        for (Med unMed : lesMeds) {
            getLeDep(unMed.getDep()).addUnMed(unMed);
            Spe uneSpe = getLaSpe(unMed.getSpe());
            if (uneSpe != null) {
                uneSpe.addUnMed(unMed);

            }

        }

    }

    public Collection<Dep> getLesDeps() {
        return lesDeps;
    }

    public Collection<Spe> getLesSpecs() {
        return lesSpecs;
    }

    public Spe getLaSpe(String spe) {
        for (Spe uneSpe : lesSpecs) {
            if (uneSpe.getNom().equals(spe)) {

                return uneSpe;

            }

        }
        return null;
    }

    public Dep getLeDep(String numDep) {
        for (Dep unDep : lesDeps) {
            if (unDep.getNum().equals(numDep)) {

                return unDep;

            }

        }
        return null;

    }

}
