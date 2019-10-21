package cn.blooming.design.builder;

public class Tom extends CartonBuilder {
    @Override
    public void buildHead() {
        System.out.println("tom head");
    }

    @Override
    public void buildBody() {
        System.out.println("tom body");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("tom arm left");
    }

    @Override
    public void buildArmRight() {
        System.out.println("tom arm right");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("tom leg left");
    }

    @Override
    public void buildLegRight() {
        System.out.println("tom leg right");
    }
}
