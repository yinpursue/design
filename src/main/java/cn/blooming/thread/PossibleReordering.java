package cn.blooming.thread;

public class PossibleReordering {
    static int x = 0;
    static int y = 0;
    static int a = 0;
    static int b = 0;
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<100000;i++){
              x = 0;
              y = 0;
              a = 0;
              b = 0;

        Thread one = new Thread(new Runnable() {
            public void run() {
                a = 1;
                x = b;//0
            }
        });

        Thread other = new Thread(new Runnable() {
            public void run() {
                b = 1;
                y = a;//0
            }
        });
        one.start();
        other.start();
        one.join();
        other.join();
        System.out.println("(" + x + "," + y + ")");
        }
    }
}
