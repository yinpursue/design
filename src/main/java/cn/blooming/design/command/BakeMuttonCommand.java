package cn.blooming.design.command;

public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.Bakemutton();
    }
}
