package com.register.university.dao;

import com.register.university.model.BachelorStudent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BachelorRepository extends JpaRepository<BachelorStudent, Integer> {
}
