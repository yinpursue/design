package cn.blooming.design.adapter.common;

public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.request();
    }
}
