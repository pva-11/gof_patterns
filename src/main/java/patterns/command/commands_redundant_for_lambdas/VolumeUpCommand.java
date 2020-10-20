package patterns.command.commands_redundant_for_lambdas;

import patterns.command.Command;
import patterns.command.TV;

public class VolumeUpCommand implements Command {
    private TV tv;

    public VolumeUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}
