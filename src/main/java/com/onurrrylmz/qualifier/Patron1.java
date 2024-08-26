package com.onurrrylmz.qualifier;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {


    //@Alternative: Aynı anda sadece bir proje çalışıyor diğerleri pasif durumda
    @Override
    public String sürüm(String data) {

        return "default data:" + data;
    }

}
