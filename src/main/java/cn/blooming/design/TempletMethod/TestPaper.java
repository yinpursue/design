package cn.blooming.design.TempletMethod;

public abstract class TestPaper {
    public void testQuestion1(){
        System.out.println("question1");
        System.out.println("answer:"+answer1());

    }

    public void testQuestion2(){
        System.out.println("question2");
        System.out.println("answer:"+answer2());

    }

    public abstract String answer1();


    public abstract String answer2();
}
