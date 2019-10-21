package cn.blooming.design.builder;

public class Jerry extends CartonBuilder {
    @Override
    public void buildHead() {
        System.out.println("Jerry head");
    }

    @Override
    public void buildBody() {
        System.out.println("Jerry body");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("Jerry arm left");
    }

    @Override
    public void buildArmRight() {
        System.out.println("Jerry arm right");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("Jerry leg left");
    }

    @Override
    public void buildLegRight() {
        System.out.println("Jerry leg right");
    }
}
