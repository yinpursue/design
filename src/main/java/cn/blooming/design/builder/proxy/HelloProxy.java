package cn.blooming.design.builder.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloProxy implements InvocationHandler {
    private Object target;
    public Object bind(Object object){
        this.target = object;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("###########jdk动态代理###############");
        Object result = null;
        result = method.invoke(target,args);
        return result;
    }
}
