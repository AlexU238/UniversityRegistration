package com.register.university.util;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
public class StudentNumberGenerator {

    private static int bachelorNum=0;
    private static int masterNum=0;

    @PersistenceContext
    private EntityManager entityManager;

    public StudentNumberGenerator(EntityManager entityManager) {
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
//добавить в выборку счет только одобреных студентов
     private void check(){
        collectBachelorAmount();
        collectMasterAmount();
    }


    private static int addBachelor() {
        bachelorNum=bachelorNum+1;
        return bachelorNum;
    }


    private static int addMaster() {
        masterNum=masterNum+1;
        return masterNum;
    }

    public static String generateBachelorNumber() {
        return "B"+ addBachelor();
    }

    public static String masterNumberGenerator() {
        return "M"+ addMaster();
    }
}
