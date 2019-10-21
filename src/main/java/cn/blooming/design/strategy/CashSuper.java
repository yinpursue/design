package cn.blooming.design.strategy;

import java.math.BigDecimal;

public abstract class CashSuper {
    abstract BigDecimal acceptCash(BigDecimal money);
}
