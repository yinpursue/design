package cn.blooming.design.simpleFactory;

import java.math.BigDecimal;

public class SubtractOperation extends Operation{

    @Override
    public BigDecimal getResult() {
        return operationDataA.subtract(operationDataB);
    }
}
