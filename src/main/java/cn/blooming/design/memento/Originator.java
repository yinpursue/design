package cn.blooming.design.memento;

public class Originator {
    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public void show(){
        System.out.println("state:"+state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
