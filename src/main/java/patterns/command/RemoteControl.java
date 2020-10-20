package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private List<Command> commands = new ArrayList<>();
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;

    public void setTurnOnCommand(Command turnOnCommand) {
        this.turnOnCommand = turnOnCommand;
        commands.add(turnOnCommand);
    }

    public void setTurnOffCommand(Command turnOffCommand) {
        this.turnOffCommand = turnOffCommand;
        commands.add(turnOffCommand);
    }

    public void setVolumeUpCommand(Command volumeUpCommand) {
        this.volumeUpCommand = volumeUpCommand;
        commands.add(volumeUpCommand);
    }

    public void setVolumeDownCommand(Command volumeDownCommand) {
        this.volumeDownCommand = volumeDownCommand;
        commands.add(volumeDownCommand);
    }

    public void pressedTurnOn() {
        turnOnCommand.execute();
    }

    public void pressedTurnOff() {
        turnOffCommand.execute();
    }

    public void pressedVolumeUp() {
        volumeUpCommand.execute();
    }

    public void pressedVolumeDown() {
        volumeDownCommand.execute();
    }

    public void invokeAll() {
        for (Command cmd : commands)
            cmd.execute();
    }
}
