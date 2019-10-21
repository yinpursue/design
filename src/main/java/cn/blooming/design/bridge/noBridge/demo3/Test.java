package cn.blooming.design.bridge.noBridge.demo3;

public class Test {
    public static void main(String[] args) {
        HandSetBrand handSetBrand = null;
        handSetBrand = new HandSetMGame();
        handSetBrand.run();

        handSetBrand = new HandSetNGame();
        handSetBrand.run();

        handSetBrand = new HandSetMAccess();
        handSetBrand.run();

        handSetBrand = new HandSetNAccess();
        handSetBrand.run();

    }
}
