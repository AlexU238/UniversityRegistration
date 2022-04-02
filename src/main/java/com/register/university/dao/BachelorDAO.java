package com.register.university.dao;

import com.register.university.model.BachelorStudent;

public interface BachelorDAO {

    BachelorStudent getBachelorStudent(int id);

    void delete(int id);

    void approve();
}
