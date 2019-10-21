package cn.blooming.design.builder.proxy;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        HelloProxy helloProxy= new HelloProxy();
        HelloService helloService=(HelloService)helloProxy.bind(new HelloServiceImpl());
        helloService.sayHello("tom");

//        Stream<String> stream = Stream.of("I", "love", "you");
//        stream.forEach(str -> System.out.println(str));



    }
}
