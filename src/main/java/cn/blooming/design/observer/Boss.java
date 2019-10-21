package cn.blooming.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {
    private List<Observer> list = new ArrayList<>();
    private String bossState;

    public String getBossState() {
        return bossState;
    }

    public void setBossState(String bossState) {
        this.bossState = bossState;
    }

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifySome() {
        for (Observer observer :list){
            if(bossState.equals("boss is comming"))
            observer.update();
        }
    }

    @Override
    public String getState() {
        return bossState;
    }

    @Override
    public void setState(String state) {
        this.bossState = state;
    }
}
