package cn.blooming.design.strategy;

import java.math.BigDecimal;


public class Test {
    public static void main(String[] args) {

        test("rebate",new BigDecimal(1),new BigDecimal(200));
        test2("rebate",new BigDecimal(1),new BigDecimal(200));
    }
    public static void test(String type,BigDecimal num,BigDecimal money){
        CashContext cashContext = null;
        switch (type)
        {
            case "normal":
                cashContext = new CashContext(new CashNormal());
                break;
            case "rebate":
                cashContext = new CashContext(new CashRebate(new BigDecimal(0.8)));
                break;
            case "return":
                cashContext = new CashContext(new CashReturn(new BigDecimal(300),new BigDecimal(100)));
                break;
        }
        BigDecimal total = new BigDecimal(0);
        BigDecimal price = cashContext.getResult(num.multiply(money));
        total  = total.add(price);
        System.out.println("单价："+money.toString()+",数量："+num.toString()+",合计："+price.toString());
        System.out.println(total);
    }
    public static void test2(String type,BigDecimal num,BigDecimal money){
        CashContextWithSimpleFactory cashContextWithSimpleFactory =new CashContextWithSimpleFactory(type);
        BigDecimal total = new BigDecimal(0);
        BigDecimal price = cashContextWithSimpleFactory.getResult(num.multiply(money));
        total  = total.add(price);
        System.out.println("单价："+money.toString()+",数量："+num.toString()+",合计："+price.toString());
        System.out.println(total);
    }
}
