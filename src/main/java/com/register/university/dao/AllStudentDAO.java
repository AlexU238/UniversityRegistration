package com.register.university.dao;

import com.register.university.model.Student;
import com.register.university.util.CurrentYear;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class AllStudentDAO implements StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void registerStudent(Student student){
        Session session = entityManager.unwrap(Session.class);
        student.setYearOfRegistration(CurrentYear.getCurrentYear());
        session.saveOrUpdate(student);
    }
}
