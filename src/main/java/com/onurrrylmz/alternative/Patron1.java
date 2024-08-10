package com.onurrrylmz.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {


    //@Alternative:
    @Override
    public String sürüm(String data) {

        return "patron 1 " + data;
    }

}
