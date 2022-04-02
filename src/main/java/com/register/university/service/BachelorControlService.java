package com.register.university.service;

import com.register.university.model.BachelorStudent;

public interface BachelorControlService {

    BachelorStudent getById(int id);

    void deleteById(int id);

    void approve();
}
