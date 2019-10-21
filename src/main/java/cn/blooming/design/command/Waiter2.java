package cn.blooming.design.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter2 {
    private List<Command> list = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        list.add(command);
    }
    public void removeCommand(Command command){
        list.remove(command);
    }
    public void notifySome(){
        for (Command command:list){
            command.executeCommand();
        }
    }
}
