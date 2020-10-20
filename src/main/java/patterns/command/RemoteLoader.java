package patterns.command;

import patterns.command.commands_redundant_for_lambdas.TurnOffCommand;
import patterns.command.commands_redundant_for_lambdas.TurnOnCommand;
import patterns.command.commands_redundant_for_lambdas.VolumeDownCommand;
import patterns.command.commands_redundant_for_lambdas.VolumeUpCommand;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        TV tv = new TV();

        control.setTurnOnCommand(new TurnOnCommand(tv));
        control.setVolumeUpCommand(new VolumeUpCommand(tv));
        control.setVolumeDownCommand(new VolumeDownCommand(tv));
        control.setTurnOffCommand(new TurnOffCommand(tv));

        System.out.println("Simple remote control buttons usage:");
        control.pressedTurnOn();
        control.pressedVolumeUp();
        control.pressedVolumeDown();
        control.pressedTurnOff();

        System.out.println("Invoke all button pressed:");
        control.invokeAll();

        /* example with lambda-expressions
        using lambda-expressions we can remove classes from package "commands_redundant_for_lambdas"
        */
        control.setTurnOnCommand(tv::turnOn);
        control.setVolumeUpCommand(tv::volumeUp);
        control.setVolumeDownCommand(tv::volumeDown);
        control.setTurnOffCommand(tv::turnOff);

        System.out.println("Lambda-expressions remote control buttons usage:");
        control.pressedTurnOn();
        control.pressedVolumeUp();
        control.pressedVolumeDown();
        control.pressedTurnOff();

    }
}
