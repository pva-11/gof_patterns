package patterns.command.commands_redundant_for_lambdas;

import patterns.command.Command;
import patterns.command.TV;

public class VolumeDownCommand implements Command {
    private TV tv;

    public VolumeDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}
