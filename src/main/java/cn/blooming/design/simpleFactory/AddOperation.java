package cn.blooming.design.simpleFactory;

import java.math.BigDecimal;

public class AddOperation extends Operation {
    @Override
    public BigDecimal getResult() {

        return operationDataA.add(operationDataB);
    }
}
