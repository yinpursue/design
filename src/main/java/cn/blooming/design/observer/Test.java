package cn.blooming.design.observer;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Boss();

        Observer tom = new StockObserver("tom",subject);
        Observer jerry = new StockObserver("jerry",subject);

        subject.attach(tom);
        subject.attach(jerry);
        subject.setState("boss is comming");
        subject.notifySome();
    }
}
