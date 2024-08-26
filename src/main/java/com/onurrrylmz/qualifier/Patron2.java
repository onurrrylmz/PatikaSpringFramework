package com.onurrrylmz.qualifier;

@QualifierMultiple

public class Patron2 implements PatronInterface {



    @Override
    public String sürüm(String data) {

        return "QualifierMultiple 1: " + data;
    }

}
