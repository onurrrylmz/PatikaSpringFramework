package com.onurrrylmz.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {


    //@Alternative: Aynı anda sadece bir proje çalışıyor diğerleri pasif durumda
    @Override
    public String sürüm(String data) {

        return "patron 1 " + data;
    }

}