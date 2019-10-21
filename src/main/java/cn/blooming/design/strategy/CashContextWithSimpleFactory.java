package cn.blooming.design.strategy;

import java.math.BigDecimal;

public class CashContextWithSimpleFactory {
    private CashSuper cashSuper;

    public CashContextWithSimpleFactory(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }
    public BigDecimal getResult(BigDecimal money){
        return cashSuper.acceptCash(money);
    }

    public CashContextWithSimpleFactory(String type) {

        switch (type)
        {
            case "normal":
               this.cashSuper = new CashNormal();
                break;
            case "rebate":
                this.cashSuper = new CashRebate(new BigDecimal(0.8));
                break;
            case "return":
                this.cashSuper = new CashReturn(new BigDecimal(300),new BigDecimal(100));
                break;
        }
    }
}
