package com.example.demo.reflection;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;

/**
 * @author xiezhaokun
 */
@Repeatable(Persons.class)
@Inherited
public @interface Person {

    String role() default "";
}
