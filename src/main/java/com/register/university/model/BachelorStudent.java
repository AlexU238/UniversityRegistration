package com.register.university.model;

import com.register.university.util.StudentNumberGenerator;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "bachelors")
public class BachelorStudent extends Student{


    @Column(name = "bachelor_number")
    private String bachelorNumber;

    public BachelorStudent() {
    }


    public void approve(){
        if(bachelorNumber==null){
            setBachelorNumber(StudentNumberGenerator.generateBachelorNumber());
        }
    }

    public String getBachelorNumber() {
        return bachelorNumber;
    }

    public void setBachelorNumber(String bachelorNumber) {
        this.bachelorNumber = bachelorNumber;
    }

    @Override
    public String toString() {
        return "BachelorStudent{" +
                "bachelorNumber='" + bachelorNumber + '\'' +
                ", student="+super.toString() + '\'' +
                '}';
    }
}
