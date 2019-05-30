package com.example.demo.reflection;

import java.lang.annotation.*;

/**
 * @author xiezhaokun
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Persons {

    Person[] value();
}
