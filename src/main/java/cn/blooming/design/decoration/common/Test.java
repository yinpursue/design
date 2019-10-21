package cn.blooming.design.decoration.common;

public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        DecoratorA decoratorA = new DecoratorA();
        DecoratorB decoratorB = new DecoratorB();
        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}
