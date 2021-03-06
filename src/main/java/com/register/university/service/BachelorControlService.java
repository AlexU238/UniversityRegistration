package com.register.university.service;

import com.register.university.model.BachelorStudent;

import java.util.List;

public interface BachelorControlService {

    BachelorStudent getById(int id);

    void delete();

    void approve(int id);

    List getAll();
}
