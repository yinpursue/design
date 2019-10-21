package cn.blooming.design.observer.common;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("tom",subject));
        subject.attach(new ConcreteObserver("jerry",subject));

        subject.setState("normal");
        subject.notifySome();

    }
}
