package org.enset.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double temp = 34;
        return temp;
    }
}
