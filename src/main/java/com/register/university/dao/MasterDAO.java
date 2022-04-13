package com.register.university.dao;

import com.register.university.model.MasterStudent;

import java.util.List;

public interface MasterDAO {

    MasterStudent getMasterStudent(int id);

    void delete(int id);

    void approve();

    List<MasterStudent> getAll();
}
