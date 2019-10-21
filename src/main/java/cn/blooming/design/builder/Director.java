package cn.blooming.design.builder;

public class Director {
    private CartonBuilder cartonBuilder;

    public Director(CartonBuilder cartonBuilder) {
        this.cartonBuilder = cartonBuilder;
    }
    public void create(){
        cartonBuilder.buildHead();
        cartonBuilder.buildBody();
        cartonBuilder.buildArmLeft();
        cartonBuilder.buildArmRight();
        cartonBuilder.buildLegLeft();
        cartonBuilder.buildLegRight();
    }
}
