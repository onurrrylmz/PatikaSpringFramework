package com.onurrrylmz.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements PatronInterface {



    @Override
    public String sürüm(String data) {

        return "patron 2 " + data;
    }

}
