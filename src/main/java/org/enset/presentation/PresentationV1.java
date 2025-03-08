package org.enset.presentation;

import org.enset.dao.DaoImpl;
import org.enset.metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat :"+metier.calcul());

    }
}
