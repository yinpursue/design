package cn.blooming.design.decoration.common;

public class DecoratorB extends Decorator{
    @Override
    void operation() {
        System.out.println("B");
        super.operation();
    }
}
