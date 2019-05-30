package com.example.demo.proxy;

import java.lang.reflect.Proxy;

/**
 * @author xiezhaokun
 */
public class JdkProxyFactory<T> {

    private final Class<T> proxyInterface;

    public JdkProxyFactory(Class<T> proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @SuppressWarnings("unchecked")
    public T newInstance(JdkProxy<T> jdkProxy) {
        return (T) Proxy.newProxyInstance(proxyInterface.getClassLoader(), new Class[]{proxyInterface}, jdkProxy);
    }


}
