package com.onurrrylmz.qualifier2;


import javax.inject.Qualifier;
import java.lang.annotation.*;


@Qualifier
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface QualifierMultiple {
}
