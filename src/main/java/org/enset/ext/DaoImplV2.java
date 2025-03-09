package org.enset.ext;

import org.enset.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double t = 21;
        return t;
    }
}
