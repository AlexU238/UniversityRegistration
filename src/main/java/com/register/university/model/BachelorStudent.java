package com.register.university.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "bachelors")
public class BachelorStudent extends Student{

//    @GenericGenerator(name="seq_id", strategy="com.register.university.util.BachelorIDGenerator")
//    @GeneratedValue(generator="seq_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "bachelor_number")
    private String bachelorNumber;

    public BachelorStudent(String bachelorNumber) {
        this.bachelorNumber = bachelorNumber;
    }

    public BachelorStudent() {

    }

    public String getBachelorNumber() {
        return bachelorNumber;
    }

    public void setBachelorNumber(String bachelorNumber) {
        this.bachelorNumber = bachelorNumber;
    }
}
