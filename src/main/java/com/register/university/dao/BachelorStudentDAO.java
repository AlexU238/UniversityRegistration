package com.register.university.dao;

import com.register.university.model.BachelorStudent;
import com.register.university.model.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class BachelorStudentDAO  implements BachelorDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public BachelorStudent getBachelorStudent(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(BachelorStudent.class, id);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from BachelorStudent where id=:id");
        query.setParameter("id",id);
        query.executeUpdate();
    }

    @Override
    public void approve() {

    }

    @Override
    public List<BachelorStudent> getAll() {
        Session session = entityManager.unwrap(Session.class);

        Query<BachelorStudent> query = session.createQuery("from BachelorStudent order by id", BachelorStudent.class);

        return query.getResultList();

    }
}
