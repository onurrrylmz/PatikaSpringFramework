package com.onurrrylmz.qualifier3;

@QualifierMultiple3(EFazlaSecenekler.UCUNCU)

public class Patron4 implements PatronInterface {



    @Override
    public String sürüm(String data) {

        return "QualifierMultiple ENUM ÜÇÜNCÜ: " + data;
    }

}
