package com.onurrrylmz.iocsiz_disiz;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizCalisan")
@ApplicationScoped


public class Calisan {

    private Patron patron;

    public Calisan(){
        patron=new Patron();
    }

    public String getData(String data){
        return patron.sürüm("17");
    }
}
