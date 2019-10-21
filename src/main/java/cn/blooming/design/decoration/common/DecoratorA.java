package cn.blooming.design.decoration.common;

public class DecoratorA extends Decorator {
    @Override
    void operation() {
        System.out.println("A");
        super.operation();
    }
}
