package cn.blooming.design.strategy;

import java.math.BigDecimal;

public class CashNormal extends CashSuper {
    @Override
    BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
