package cn.blooming.design.strategy;

import java.math.BigDecimal;

public class CashRebate extends CashSuper {

    private BigDecimal moneyRebate = new BigDecimal(1);
    public CashRebate(BigDecimal moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    BigDecimal acceptCash(BigDecimal money) {
        return money.multiply(moneyRebate);
    }
}
