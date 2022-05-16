package com.register.university.service;

import com.register.university.model.BachelorStudent;
import com.register.university.model.MasterStudent;

import java.util.List;

public interface MasterControlService {

    MasterStudent getById(int id);

    void delete();

    void approve(int id);

    List getAll();
}
