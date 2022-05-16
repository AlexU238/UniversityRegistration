package com.register.university.service;

import com.register.university.dao.BachelorNotApprovedDelete;
import com.register.university.model.BachelorStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BachelorService implements BachelorControlService {

    private BachelorNotApprovedDelete bachelorNotApprovedDelete;
    private JpaRepository<BachelorStudent, Integer> repository;

    @Autowired
    public BachelorService(@Qualifier("studentDeleter") BachelorNotApprovedDelete bachelorNotApprovedDelete,
                           @Qualifier("bachelorRepository") JpaRepository<BachelorStudent, Integer> repository) {
        this.bachelorNotApprovedDelete = bachelorNotApprovedDelete;
        this.repository = repository;
    }


    @Override
    public BachelorStudent getById(int id) {
        Optional<BachelorStudent> optional = repository.findById(id);
        BachelorStudent bachelorStudent;
        if (optional.isPresent()) {
            bachelorStudent = optional.get();
        } else throw new RuntimeException();

        return bachelorStudent;
    }

    @Override
    public void delete() {
        bachelorNotApprovedDelete.deleteBachelorNotApproved();
    }


    @Override
    public void approve(int id) {
        BachelorStudent bachelorStudent=getById(id);
        bachelorStudent.approve();
        repository.save(bachelorStudent);
    }



    @Override
    public List getAll() {
        return repository.findAll();
    }
}
