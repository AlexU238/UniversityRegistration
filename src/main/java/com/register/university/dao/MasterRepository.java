package com.register.university.dao;

import com.register.university.model.MasterStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterRepository extends JpaRepository<MasterStudent, Integer> {
}
