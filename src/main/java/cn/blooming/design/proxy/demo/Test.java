package cn.blooming.design.proxy.demo;

public class Test {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("calerna");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveFlower();
    }
}
