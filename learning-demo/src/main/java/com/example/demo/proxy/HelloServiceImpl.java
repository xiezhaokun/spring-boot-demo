package com.example.demo.proxy;

/**
 * @author xiezhaokun
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public void test(String value) {
        System.out.println("test()");
    }

    @Override
    public void testB(String value,String name) {
        System.out.println("testB()");
    }
}
