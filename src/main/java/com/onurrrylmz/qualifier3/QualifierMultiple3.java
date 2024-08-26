package com.onurrrylmz.qualifier3;


import javax.inject.Qualifier;
import java.lang.annotation.*;


@Qualifier
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface QualifierMultiple3 {

    //Enum yapısı
    EFazlaSecenekler value();

}
