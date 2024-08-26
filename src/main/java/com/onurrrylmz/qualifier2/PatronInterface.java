package com.onurrrylmz.qualifier2;

public interface PatronInterface {

    //@Alternative: Aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    //@Qualifier: Aynı anda birdem fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz.

    public String sürüm(String data);
}
