/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author sio
 */
public class Dep implements Comparable<Dep> {

    private String num;
    private Collection<Med> lesMeds = new TreeSet<>();

    public Dep(String num) {
        this.num = num;

    }

    public String getNum() {
        return num;
    }

    public Collection<Med> getLesMeds() {
        return lesMeds;
    }

    public int compareTo(Dep o) {
        return num.compareTo(o.num);
    }

    public void addUnMed(Med unMed) {
        lesMeds.add(unMed);

    }

}
