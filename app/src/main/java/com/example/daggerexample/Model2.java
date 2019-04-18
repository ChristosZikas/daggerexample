package com.example.daggerexample;

public class Model2 {

    String m2;

    public Model2(Model1 model1) {
        m2 = model1.getString() + " MODEL 2";
    }

}
