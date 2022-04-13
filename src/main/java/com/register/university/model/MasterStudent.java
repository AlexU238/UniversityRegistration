package com.register.university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "masters")
public class MasterStudent extends Student {

    @Column(name = "master_number")
    private String masterNumber;

    @Column(name = "bachelor")
    private String bachelor;

    public MasterStudent() {
    }

    public String getMasterNumber() {
        return masterNumber;
    }

    public void setMasterNumber(String masterNumber) {
        this.masterNumber = masterNumber;
    }

    public String getBachelor() {
        return bachelor;
    }

    public void setBachelor(String bachelor) {
        this.bachelor = bachelor;
    }
}
