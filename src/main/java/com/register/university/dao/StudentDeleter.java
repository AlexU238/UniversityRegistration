package com.register.university.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Component
@Transactional
public class StudentDeleter implements BachelorNotApprovedDelete, MasterNotApprovedDelete{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void deleteBachelorNotApproved() {
        Session session=entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from BachelorStudent b where b.bachelorNumber is null ");
        query.executeUpdate();
    }

    @Override
    public void deleteMasterNotApproved() {
        Session session=entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from MasterStudent where masterNumber is null ");
        query.executeUpdate();
    }
}
