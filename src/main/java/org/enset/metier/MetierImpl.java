package org.enset.metier;

import org.enset.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao ;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {

    }


    @Override
    public double calcul() {
        double t = dao.getData();
        double result = t*23;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
