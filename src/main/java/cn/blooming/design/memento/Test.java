package cn.blooming.design.memento;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Memento memento = originator.createMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(memento);

        originator.setState("Off");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();
    }
}
