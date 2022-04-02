package com.register.university.service;

import com.register.university.dao.BachelorDAO;
import com.register.university.model.BachelorStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BachelorService implements BachelorControlService {

    private BachelorDAO bachelorDAO;

    @Autowired
    public BachelorService(@Qualifier("bachelorStudentDAO") BachelorDAO bachelorDAO) {
        this.bachelorDAO = bachelorDAO;
    }

    @Override
    public BachelorStudent getById(int id) {
        return bachelorDAO.getBachelorStudent(id);
    }

    @Override
    public void deleteById(int id) {
        bachelorDAO.delete(id);
    }

    @Override
    public void approve() {

    }
}
