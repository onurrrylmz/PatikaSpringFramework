package com.onurrrylmz.qualifier3;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped


public class Calisan {
    //Defaultta çalışacak kodlar
//    @Inject  // Dependency Injection oluyor
//    private PatronInterface patronInterface;

    //İstediğim seçeneği  seçiyorum.
//    @Inject  // Dependency Injection oluyor
//    @QualifierMultiple3(EFazlaSecenekler.BIRINCI)
//    private PatronInterface patronInterface;

    @Inject  // Dependency Injection oluyor
    @QualifierMultiple3(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;


//    @Inject  // Dependency Injection oluyor
//    @QualifierMultiple3(EFazlaSecenekler.UCUNCU)
//    private PatronInterface patronInterface;


    public Calisan(){

        //patronInterface=new Patron(); // Dependecy Injection yaptığımız için new yapmamıza gerek kalmıyor
    }

    public String getData(String data){

        return patronInterface.sürüm(data);
    }
}
