package patterns.command.commands_redundant_for_lambdas;

import patterns.command.Command;
import patterns.command.TV;

public class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
