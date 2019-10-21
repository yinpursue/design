package cn.blooming.design.TempletMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("学生A的试卷：");
        TestPaper testPaper1 = new StudentA();
        testPaper1.testQuestion1();
        testPaper1.testQuestion2();

        System.out.println("学生B的试卷：");
        TestPaper testPaper2 = new StudentB();
        testPaper2.testQuestion1();
        testPaper2.testQuestion2();
    }
}
