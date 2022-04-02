package com.register.university.service;

import com.register.university.model.BachelorStudent;
import com.register.university.model.MasterStudent;

public interface MasterControlService {

    MasterStudent getById(int id);

    void deleteById(int id);

    void approve();
}
