package cn.blooming.design.factoryMethod;

import java.math.BigDecimal;

public class AddOperation extends Operation {
    @Override
    public BigDecimal getResult() {

        return operationDataA.add(operationDataB);
    }
}
