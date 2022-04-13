package com.register.university.service;

import com.register.university.dao.MasterDAO;
import com.register.university.model.MasterStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterService implements MasterControlService {

    private MasterDAO masterDAO;

    @Autowired
    public MasterService(@Qualifier("masterStudentDAO") MasterDAO masterDAO) {
        this.masterDAO = masterDAO;
    }

    @Override
    public MasterStudent getById(int id) {
        return masterDAO.getMasterStudent(id);
    }

    @Override
    public void deleteById(int id) {
        masterDAO.delete(id);
    }

    @Override
    public void approve() {

    }

    @Override
    public List getAll() {
        return masterDAO.getAll();
    }
}
