package org.enset.presentation;

import org.enset.dao.DaoImpl;
import org.enset.ext.DaoImplV2;
import org.enset.metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {

        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat :"+metier.calcul());

    }
}
