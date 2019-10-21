package cn.blooming.design.simpleFactory;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Operation operation = SimpleFactory.getOperation("+");
        operation.setOperationDataA(new BigDecimal(1));
        operation.setOperationDataB(new BigDecimal(2));
        BigDecimal result = operation.getResult();
        System.out.println(result);
    }
}
