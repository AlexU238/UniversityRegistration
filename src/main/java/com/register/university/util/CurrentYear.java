package com.register.university.util;

import java.time.LocalDate;

public abstract class CurrentYear {

    public static int getCurrentYear(){
        return LocalDate.now().getYear();
    }
}
