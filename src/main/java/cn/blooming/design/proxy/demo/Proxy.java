package cn.blooming.design.proxy.demo;

public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        this.pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }
}
