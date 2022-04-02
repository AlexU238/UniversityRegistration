package com.register.university.dao;

import com.register.university.model.Student;
import com.register.university.util.CurrentYear;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AllStudentDAO implements StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void registerStudent(Student student){
        Session session = entityManager.unwrap(Session.class);
        student.setYearOfRegistration(CurrentYear.getCurrentYear());
        session.saveOrUpdate(student);
    }
}
