package cn.blooming.thread;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE+1);
        System.out.println(Math.abs(Integer.MIN_VALUE+1));
        System.out.println(Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE);

        Random random = new Random(System.currentTimeMillis());
        System.out.println(Integer.MIN_VALUE);
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        String key="wefa";
        String key1="wefa";
        System.out.println(key==key1);
        System.out.println(key.equals(key1));
        System.out.println(key=="wefa");
        System.out.println(key.equals("wefa"));
    }
}
