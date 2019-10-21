package cn.blooming.design.factoryMethod;


public class SubtractFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new SubtractOperation();
    }
}
