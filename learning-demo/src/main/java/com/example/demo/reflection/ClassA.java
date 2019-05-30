package com.example.demo.reflection;

/**
 * @author xiezhaokun
 */
@AnnotationB("ClassA.AnnotationB")
@Person(role = "roleA")
@Person(role = "roleB")
@Person(role = "roleC")
@Person(role = "roleD")
public class ClassA {

    private String testFieldAPrivate;

    protected String testFieldAprotected;

    public String testFieldApublic;

    public String testField = "A";

    public ClassA() {

    }

    private ClassA(String testFieldBPrivate, String testFieldAprotected, String testFieldApublic) {

    }

    protected ClassA(String testFieldAPrivate) {

    }

    public ClassA(String testFieldBPrivate, String testFieldAprotected) {

    }

    public void testAPublic() {

    }

    protected void testAProtected() {

    }

    private void testAPrivate() {

    }

    public void test() {
        System.out.println("ClassA test()");
    }
}
