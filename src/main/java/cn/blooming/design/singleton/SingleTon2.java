package cn.blooming.design.singleton;

public class SingleTon2 {
    private static SingleTon2 singleTon1 = new SingleTon2();
    private SingleTon2(){}
    public static SingleTon2 getInstance(){
        return singleTon1;
    }
}
