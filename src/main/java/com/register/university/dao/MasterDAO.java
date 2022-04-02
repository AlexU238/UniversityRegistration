package com.register.university.dao;

import com.register.university.model.MasterStudent;

public interface MasterDAO {

    MasterStudent getMasterStudent(int id);

    void delete(int id);

    void approve();
}
