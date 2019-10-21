package cn.blooming.design.strategy;

import java.math.BigDecimal;

public class CashReturn extends CashSuper {
    private BigDecimal condition = new BigDecimal(0);
    private BigDecimal moneyReturn = new BigDecimal(0);

    public CashReturn(BigDecimal condition, BigDecimal moneyReturn) {
        this.condition = condition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    BigDecimal acceptCash(BigDecimal money) {
        if(money.compareTo(condition)>=0){
            return money.subtract(money.divideToIntegralValue(condition).multiply(moneyReturn));
        }
        return money;
    }
}
