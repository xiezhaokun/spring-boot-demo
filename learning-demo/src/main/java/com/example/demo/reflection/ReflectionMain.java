package com.example.demo.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * method
 * 带declared 的方法，查询本类的所有方法，
 * 不带带declared的方法，查询本类以及子类的public 方法,若有方法覆盖，则子类被覆盖的方法查询不到
 * field
 * 带declared 的方法，查询本类的属性
 * 不带带declared的方法，查询本类以及子类的public属性
 *
 * @author xiezhaokun
 */
public class ReflectionMain {

    public static void main(String[] args) {
        ClassB classB = new ClassB();

        Annotation[] declaredAnnotations = classB.getClass().getDeclaredAnnotations();
        System.out.println(declaredAnnotations.length);

        Annotation[] annotations = classB.getClass().getAnnotations();
        System.out.println(annotations.length);


        Persons[] annotationsByType = classB.getClass().getAnnotationsByType(Persons.class);

        Person annotation = classB.getClass().getAnnotation(Person.class);


        Person[] annotationsByType1 = classB.getClass().getAnnotationsByType(Person.class);


        AnnotatedType annotatedSuperclass = classB.getClass().getAnnotatedSuperclass();
        System.out.println(annotatedSuperclass);

        Method[] declaredMethods = classB.getClass().getDeclaredMethods();
        System.out.println(declaredMethods.length);

        Method[] methods = classB.getClass().getMethods();
        System.out.println(methods.length);

        Field[] declaredFields = classB.getClass().getDeclaredFields();
        System.out.println(declaredFields.length);

        Field[] fields = classB.getClass().getFields();
        System.out.println(fields.length);

        Constructor<?>[] declaredConstructors = classB.getClass().getDeclaredConstructors();
        System.out.println(declaredConstructors.length);

        Constructor<?>[] constructors = classB.getClass().getConstructors();
        System.out.println(constructors.length);
    }

}
