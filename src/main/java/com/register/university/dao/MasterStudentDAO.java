package com.register.university.dao;

import com.register.university.model.MasterStudent;
import com.register.university.model.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class MasterStudentDAO implements MasterDAO {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public MasterStudent getMasterStudent(int id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(MasterStudent.class, id);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from MasterStudent where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void approve() {

    }
}
