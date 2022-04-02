package com.register.university.util;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
class StudentAmountNumbers implements BachelorAddition, MasterAddition{

    private static int bachelorNum=0;
    private static int masterNum=0;

    @PersistenceContext
    private EntityManager entityManager;

    public StudentAmountNumbers(EntityManager entityManager) {
        this.entityManager=entityManager;
        check();
    }

    private void collectBachelorAmount(){

        if(bachelorNum==0){
            Session session=entityManager.unwrap(Session.class);
            Query query = session.createQuery("select count(s) from BachelorStudent s where s.yearOfRegistration =: this_year");
            query.setParameter("this_year",CurrentYear.getCurrentYear());
            bachelorNum=query.getFirstResult();
        }
    }

    private void collectMasterAmount(){
        if(masterNum==0){
            Session session=entityManager.unwrap(Session.class);
            Query query = session.createQuery("select count(s) from MasterStudent s where s.yearOfRegistration =: this_year");
            query.setParameter("this_year",CurrentYear.getCurrentYear());
            bachelorNum=query.getFirstResult();
        }
    }

     private void check(){
        collectBachelorAmount();
        collectMasterAmount();
    }


    @Override
    public int addBachelor() {
        bachelorNum=bachelorNum+1;
        return bachelorNum;
    }

    @Override
    public int addMaster() {
        masterNum=masterNum+1;
        return masterNum+1;
    }
}
