package cn.blooming.design.simpleFactory;

import java.math.BigDecimal;

public class Operation {
    protected BigDecimal operationDataA;
    protected BigDecimal operationDataB;

    public BigDecimal getResult(){
        return new BigDecimal(0);
    }

    public BigDecimal getOperationDataA() {
        return operationDataA;
    }

    public void setOperationDataA(BigDecimal operationDataA) {
        this.operationDataA = operationDataA;
    }

    public BigDecimal getOperationDataB() {
        return operationDataB;
    }

    public void setOperationDataB(BigDecimal operationDataB) {
        this.operationDataB = operationDataB;
    }
}
