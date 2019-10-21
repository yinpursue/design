package cn.blooming.design.command;

public class Waiter {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void notifySome(){
        command.executeCommand();
    }
}
