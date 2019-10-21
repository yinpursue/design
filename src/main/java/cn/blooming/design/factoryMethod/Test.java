package cn.blooming.design.factoryMethod;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        operation.setOperationDataA(new BigDecimal(1));
        operation.setOperationDataB(new BigDecimal(2));
        System.out.println(operation.getResult());
    }
}
