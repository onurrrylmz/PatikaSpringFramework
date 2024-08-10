package com.onurrrylmz.alternative;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped


public class Calisan {

    @Inject  // Dependency Injection oluyor
    private PatronInterface patronInterface;

    public Calisan(){

        //patronInterface=new Patron(); // Dependecy Injection yaptığımız için new yapmamıza gerek kalmıyor
    }

    public String getData(String data){

        return patronInterface.sürüm(data);
    }
}
