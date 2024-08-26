package com.onurrrylmz.qualifier3;

@QualifierMultiple3(EFazlaSecenekler.BIRINCI)

public class Patron2 implements PatronInterface {



    @Override
    public String sürüm(String data) {

        return "QualifierMultiple ENUM BİRİNCİ : " + data;
    }

}
