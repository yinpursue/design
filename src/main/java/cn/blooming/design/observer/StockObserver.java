package cn.blooming.design.observer;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getState()+","+name+",请停止其他活动，开始工作！");
    }
}
