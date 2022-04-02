package com.register.university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "masters")
public class MasterStudent extends Student{

    @Column(name = "master_number")
    private String masterNumber;


    public MasterStudent(String masterNumber) {
        this.masterNumber = masterNumber;
    }

    public MasterStudent() {

    }

    public String getMasterNumber() {
        return masterNumber;
    }

    public void setMasterNumber(String masterNumber) {
        this.masterNumber = masterNumber;
    }


}
