package cn.blooming.design.bridge.noBridge.demo4;

public class Test {
    public static void main(String[] args) {
        HandSetBrand handSetBrand = null;
        handSetBrand = new MBrand();
        handSetBrand.setFunction(new GameFunction());
        handSetBrand.run();

    }
}
