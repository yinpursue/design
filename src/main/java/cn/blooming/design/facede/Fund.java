package cn.blooming.design.facede;

public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;
    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
    }

    public void buy(){
        stock1.buy();
        stock2.buy();
        stock3.buy();

    }
    public void sell(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
}
