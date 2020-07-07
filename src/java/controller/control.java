/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.TreeSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Dep;
import modele.Med;
import modele.Pays;

/**
 *
 * @author sio
 */
public class control extends HttpServlet {

    private Pays p;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        p = new Pays();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            String page = "v_med.jsp";
            request.getRequestDispatcher(page).forward(request, response);

        }

        switch (action) {

            case "choixdep":
                request.setAttribute("liste", p.getLesDeps());

                String page2 = "v_dep.jsp";
                request.getRequestDispatcher(page2).forward(request, response);
                break;

            case "choixnom":
                String numDep = request.getParameter("monselect");
                String page3 = "v_nom.jsp";
                request.setAttribute("listeMed", p.getLeDep(numDep).getLesMeds());
                request.getRequestDispatcher(page3).forward(request, response);
                break;

            case "mednom":
                String page4 = "v_medparnom.jsp";
                request.getRequestDispatcher(page4).forward(request, response);
                break;

            case "listemed":
                String nom = request.getParameter("medparnom");
                Collection<Med> resultat = new TreeSet();
                for (Dep d : p.getLesDeps()) {
                    for (Med m : d.getLesMeds()) {
                        if (m.getNom().startsWith(nom)) {
                            resultat.add(m);

                        }

                    }

                }

                request.setAttribute("medparnom", resultat);
                String page5 = "v_liste.jsp";
                request.getRequestDispatcher(page5).forward(request, response);

                break;
            case "medspe":
                String page6 = "v_spe.jsp";
                request.setAttribute("liste", p.getLesSpecs());
                request.getRequestDispatcher(page6).forward(request, response);

                break;
            case "listespe":
                String spe = request.getParameter("monselect");
                request.setAttribute("medparnom", p.getLaSpe(spe).getLesMeds());
                String page7 = "v_listespe.jsp";
                request.getRequestDispatcher(page7).forward(request, response);
                break;

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
