package cn.blooming.design.chainOfResponsibility;

public abstract class Manager {
    protected String name;

    protected Manager superior;

    public abstract void handlerRequest(Request request);

    public Manager(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }
}
