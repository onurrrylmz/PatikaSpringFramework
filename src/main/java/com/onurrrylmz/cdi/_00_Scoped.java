package com.onurrrylmz.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import javax.inject.Singleton;
import java.io.Serial;
import java.io.Serializable;

//kapsam
//yaşam süressi
//performansımızı + -
@Named
//@ApplicationScoped //bütün uygulama boyunca çalışıyor bütün kullanıcılar
//@RequestScoped //1 istek boyunca yaşar. istersin cevabını verir ve ölür
//@SessionScoped //bir kullanıcı için yaşar ancak logout olduğu zaman çıkışını sağlar
//@Dependent //bukelemun
//@ConversationScoped //belli istek boyunca yaşar
//@Singleton //Bean 1 instance olmasını sağlamak için
public class _00_Scoped  {

}
