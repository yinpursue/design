package cn.blooming.design.observer.common;

public class ConcreteObserver extends Observer {

    private String name;
    private String state;
    private ConcreteSubject concreteSubject;

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        state = concreteSubject.getState();
        System.out.println("观察者"+name+"的状态是"+state);
    }
}
