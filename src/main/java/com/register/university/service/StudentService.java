package com.register.university.service;

import com.register.university.dao.StudentDAO;
import com.register.university.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentControlService {

    private StudentDAO studentDAO;

    @Autowired
    public StudentService(@Qualifier("allStudentDAO") StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void registerStudent(Student student) {
        studentDAO.registerStudent(student);
    }


}
