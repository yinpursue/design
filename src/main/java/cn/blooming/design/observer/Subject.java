package cn.blooming.design.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);

    void notifySome();
    void setState(String state);
    String getState();
}
