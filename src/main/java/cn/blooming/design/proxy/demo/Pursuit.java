package cn.blooming.design.proxy.demo;

public class Pursuit implements GiveGift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    public Pursuit() {
    }


    @Override
    public void giveFlower() {
        System.out.println(schoolGirl.getName()+"送你玫瑰！");
    }
}
