package com.example.demo.reflection;

/**
 * @author xiezhaokun
 */
//@AnnotationB(value ="ClassB.AnnotationB")
public class ClassB extends ClassA{

    private String testFieldBPrivate;

    protected String testFieldBprotected;

    public String testFieldBpublic;

    public String testField = "B";

    public ClassB() {

    }

    private ClassB(String testFieldBPrivate, String testFieldBprotected,String testFieldBpublic) {

    }

    protected ClassB(String testFieldBPrivate) {

    }

    public ClassB(String testFieldBPrivate, String testFieldBprotected) {

    }

    public void testBPublic() {

    }

    protected void testBProtected() {

    }

    private void testBPrivate() {

    }

    @Override
    public void test() {
        System.out.println("ClassB test()");
    }
}
