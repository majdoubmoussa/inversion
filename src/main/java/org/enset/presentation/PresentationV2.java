package org.enset.presentation;

import org.enset.dao.IDao;
import org.enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class<?> daoClass = Class.forName(daoClassName);
        IDao dao =(IDao) daoClass.getConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class<?> metierClass = Class.forName(metierClassName);
        IMetier metier =(IMetier) metierClass.getConstructor(IDao.class).newInstance(dao);

        System.out.println(metier.calcul());


    }
}
