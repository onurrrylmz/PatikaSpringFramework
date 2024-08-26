package com.onurrrylmz.qualifier2;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped


public class Calisan {
    //Defaultta çalışacak kodlar
    @Inject  // Dependency Injection oluyor
    private PatronInterface patronInterface;

    //Defaultta çalışacak kodlar
//    @Inject  // Dependency Injection oluyor
//    @QualifierMultiple
//    private PatronInterface patronInterface;

    public Calisan(){

        //patronInterface=new Patron(); // Dependecy Injection yaptığımız için new yapmamıza gerek kalmıyor
    }

    public String getData(String data){

        return patronInterface.sürüm(data);
    }
}
