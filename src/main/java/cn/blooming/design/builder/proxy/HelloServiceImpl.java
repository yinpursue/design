package cn.blooming.design.builder.proxy;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.err.println("Hello "+name);
    }
}
