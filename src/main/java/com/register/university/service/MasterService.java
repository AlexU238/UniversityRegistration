package com.register.university.service;

import com.register.university.dao.MasterNotApprovedDelete;
import com.register.university.model.MasterStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MasterService implements MasterControlService{

    private MasterNotApprovedDelete masterNotApprovedDelete;
    private JpaRepository<MasterStudent, Integer> repository;

    @Autowired
    public MasterService(MasterNotApprovedDelete masterNotApprovedDelete,
                         @Qualifier("masterRepository") JpaRepository<MasterStudent, Integer> repository) {
        this.masterNotApprovedDelete = masterNotApprovedDelete;
        this.repository = repository;
    }

    @Override
    public MasterStudent getById(int id) {
        Optional<MasterStudent> optional = repository.findById(id);
        MasterStudent masterStudent;
        if (optional.isPresent()) {
            masterStudent = optional.get();
        } else throw new RuntimeException();

        return masterStudent;
    }

    @Override
    public void delete() {
        masterNotApprovedDelete.deleteMasterNotApproved();
    }

    @Override
    public void approve(int id) {
        MasterStudent masterStudent=getById(id);
        masterStudent.approve();
        repository.save(masterStudent);
    }

    @Override
    public List getAll() {
        return repository.findAll();
    }
}
