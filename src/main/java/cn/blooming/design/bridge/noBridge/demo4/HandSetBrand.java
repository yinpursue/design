package cn.blooming.design.bridge.noBridge.demo4;

public abstract class HandSetBrand {
    protected Function function;


    public void setFunction(Function function) {
        this.function = function;
    }

    public abstract  void run();
}
