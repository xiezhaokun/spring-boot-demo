package com.example.demo.proxy;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @author xiezhaokun
 */
public class ProxyTest {

    public static void main(String[] args) {

        //JDK动态代理
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloServiceImpl helloService = new HelloServiceImpl();
       /* JdkProxy<IHelloService> jdkProxy = new JdkProxy<>(helloService);
        JdkProxyFactory<IHelloService> jdkProxyFactory = new JdkProxyFactory<>(IHelloService.class);
        IHelloService newInstance = jdkProxyFactory.newInstance(jdkProxy);
        newInstance.test("测试");
        newInstance.testB("测试","ces111");*/

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"./");
        CGLibProxy<HelloServiceImpl> cgLibProxy = new CGLibProxy<>();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(helloService.getClass());
        enhancer.setCallback(cgLibProxy);
        enhancer.setInterfaces(new Class[]{IHelloService.class});
        HelloServiceImpl proxy = (HelloServiceImpl)enhancer.create();
        proxy.test("测试2");
        proxy.testB("测试2","cs2");

    }
}
