package com.onurrrylmz.qualifier3;

@QualifierMultiple3(EFazlaSecenekler.IKINCI)

public class Patron3 implements PatronInterface {



    @Override
    public String sürüm(String data) {

        return "QualifierMultiple ENUM İKİNCİ : " + data;
    }

}
