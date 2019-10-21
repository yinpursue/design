package cn.blooming.design.factoryMethod;



import java.math.BigDecimal;

public class SubtractOperation extends Operation{

    @Override
    public BigDecimal getResult() {
        return operationDataA.subtract(operationDataB);
    }
}
