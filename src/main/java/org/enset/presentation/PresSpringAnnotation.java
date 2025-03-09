package org.enset.presentation;

import org.enset.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.enset");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
