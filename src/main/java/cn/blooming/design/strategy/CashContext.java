package cn.blooming.design.strategy;

import java.math.BigDecimal;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }
    public BigDecimal getResult(BigDecimal money){
        return cashSuper.acceptCash(money);
    }

}
