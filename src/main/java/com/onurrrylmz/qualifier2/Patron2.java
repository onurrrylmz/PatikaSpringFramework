package com.onurrrylmz.qualifier2;

@QualifierMultiple

public class Patron2 implements PatronInterface {



    @Override
    public String sürüm(String data) {

        return "QualifierMultiple 1: " + data;
    }

}
