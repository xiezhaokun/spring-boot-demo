package com.example.demo.reflection;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Inherited
public @interface AnnotationA {
    String value() default "";
}
