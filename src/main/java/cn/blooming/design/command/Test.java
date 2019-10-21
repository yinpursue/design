package cn.blooming.design.command;

public class Test {
//    public static void main(String[] args) {
//        Barbecuer barbecuer = new Barbecuer();
//        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
//        Command bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);
//
//        Waiter waiter = new Waiter();
//        waiter.setCommand(bakeMuttonCommand);
//        waiter.notifySome();
//        waiter.setCommand(bakeChickenWingCommand);
//        waiter.notifySome();
//
//    }
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);

        Waiter2 waiter = new Waiter2();
        waiter.setCommand(bakeMuttonCommand);

        waiter.setCommand(bakeChickenWingCommand);
        waiter.notifySome();

    }
}
