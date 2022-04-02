package com.register.university.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BachelorNumberGenerator implements StudentNumberGenerator {


    private BachelorAddition bachelorAddition;

    @Autowired
    public BachelorNumberGenerator(BachelorAddition bachelorAddition) {
        this.bachelorAddition = bachelorAddition;
    }

    @Override
    public String generate() {
        System.out.println();
        return "B"+bachelorAddition.addBachelor();
    }
}
